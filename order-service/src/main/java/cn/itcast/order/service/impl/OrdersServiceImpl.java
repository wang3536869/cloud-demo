package cn.itcast.order.service.impl;

import cn.itcast.feign.clients.UserClient;
import cn.itcast.order.mapper.OrdersMapper;
import cn.itcast.order.service.OrdersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wang.pojo.Orders;
import com.wang.pojo.RUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wjs35
 * @description 针对表【orders(订单表)】的数据库操作Service实现
 * @createDate 2024-10-20 18:41:56
 */
@Service
@Slf4j
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements OrdersService {

    @Resource
    private OrdersMapper ordersMapper;
    @Resource
    private UserClient userClient;


    @Override
    public List<Orders> getOrderByUserId(Long userId) {
        return ordersMapper.getOrderByUserId(userId);
    }

    @Override
    public List<Orders> getAll() {
        return ordersMapper.getAll();

    }
   @RabbitListener(queues = "order_queue")
    public void receive(RUser rUser){
      log.info("RUser:{}",rUser.toString());
   }
}
