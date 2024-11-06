package com.wang.dish.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.pojo.Dish;

import java.util.List;

public interface DishService  extends IService<Dish> {

    List<Dish>getAll();


    List<Dish>getDishesAll(Long dishId);

}
