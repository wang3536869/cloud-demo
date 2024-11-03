package cn.itcast.feign.clients;

import cn.itcast.feign.clients.fallback.OrdersClientFallback;
import com.wang.pojo.Orders;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "orderservice",fallback = OrdersClientFallback.class)
public interface OrdersClient {

    @GetMapping("/order/getOrderByUserId")
    List<Orders> getOrderByUserId(@RequestParam Long  userId);
}
