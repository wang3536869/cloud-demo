package com.wang.dish.web;

import com.wang.dish.service.DishService;
import com.wang.pojo.Dish;
import com.wang.response.ApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/dish")
public class DishWeb {

    @Resource
    private DishService dishService;

    @RequestMapping(value ="/getAll",method = RequestMethod.GET)
    public ApiResponse<List<Dish>>getAll(){
        return ApiResponse.success(dishService.getAll());
    }


}
