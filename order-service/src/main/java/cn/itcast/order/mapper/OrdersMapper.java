package cn.itcast.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wang.pojo.Orders;

import java.util.List;

/**
* @author wjs35
* @description 针对表【orders(订单表)】的数据库操作Mapper
* @createDate 2024-10-20 18:41:56
* @Entity cn.itcast.order.pojo.Orders
*/
public interface OrdersMapper extends BaseMapper<Orders> {

    List<Orders> getAll();

    List<Orders> getOrderByUserId(Long userId);


}
