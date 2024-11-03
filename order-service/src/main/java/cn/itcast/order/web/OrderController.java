package cn.itcast.order.web;

import cn.itcast.order.service.OrdersService;
import com.wang.pojo.Orders;
import com.wang.response.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

   @Resource
   private OrdersService orderService;

    @GetMapping("/getAll")
    public ApiResponse<List<Orders>> getAll() {
        // 根据id查询订单并返回
        List<Orders> orders = orderService.getAll();
        return ApiResponse.success("success",orders);
    }

    @GetMapping("/getOrderByUserId")
    public List<Orders> getOrderByUserId(Long userId){
        return  orderService.getOrderByUserId(userId);
    }
}
