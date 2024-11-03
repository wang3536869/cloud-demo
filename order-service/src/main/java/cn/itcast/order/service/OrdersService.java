package cn.itcast.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.pojo.Orders;

import java.util.List;


/**
* @author wjs35
* @description 针对表【orders(订单表)】的数据库操作Service
* @createDate 2024-10-20 18:41:56
*/
public interface OrdersService extends IService<Orders> {
//    /    @Autowired
//    private OrderMapper orderMapper;
//
//    @Autowired
//    private UserClient userClient;
//
//    public Order queryOrderById(Long orderId) {
//        // 1.查询订单
//        Order order = orderMapper.findById(orderId);
//        // 2.用Feign远程调用
//        User user = userClient.findById(order.getUserId());
//        // 3.封装user到Order
//        order.setUser(user);
//        // 4.返回
//        return order;
//    }
      List<Orders>getAll();

      List<Orders> getOrderByUserId(Long userId);

}
