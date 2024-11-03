package cn.itcast.feign.clients.fallback;

import cn.itcast.feign.clients.OrdersClient;
import com.wang.pojo.Orders;

import java.util.List;

public class OrdersClientFallback implements OrdersClient {
    @Override
    public List<Orders> getOrderByUserId(Long  userId) {
        return null;
    }
}
