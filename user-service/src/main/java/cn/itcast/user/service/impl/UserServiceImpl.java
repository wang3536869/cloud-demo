package cn.itcast.user.service.impl;

import cn.itcast.feign.clients.OrdersClient;
import cn.itcast.user.mapper.UserMapper;
import cn.itcast.user.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wang.pojo.Orders;
import com.wang.pojo.RUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, RUser> implements UserService {
    @Resource
    private UserMapper userMapper;
    @Resource
    private OrdersClient ordersClient;
    @Resource
    private RabbitTemplate rabbitTemplate;

    private static final String EXCHANGE_NAME="order_queue";
    private static final String ROUTING_KEY="order_routingKey";

    @Override
    public RUser queryById(String username) {
        return userMapper.findById(username);
    }

    @Override
    public List<RUser> getAllUsers() {
        List<RUser> allUsers = userMapper.getAllUsers();
        for (RUser ruser:allUsers){
            if(ruser.getUserId()!=null) {
                List<Orders> orderByUserId = ordersClient.getOrderByUserId(ruser.getUserId());
                if (orderByUserId != null) {
                    ruser.setUserOrders(orderByUserId);
                }
            }
        }
        return allUsers;
    }

    public void SendMessage(RUser rUser){
        log.info("message:{}",rUser);
        rabbitTemplate.convertAndSend(EXCHANGE_NAME,ROUTING_KEY,rUser);
    }
}
