package com.wang.dish.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wang.dish.mapper.DishMapper;
import com.wang.dish.service.DishService;
import com.wang.pojo.Dish;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DishServiceImpl extends ServiceImpl<DishMapper, Dish>implements DishService {

    @Resource
    private DishMapper dishMapper;

    @Override
    public List<Dish> getAll() {
        return dishMapper.getAll();
    }

    @Override
    public List<Dish> getDishesAll(Long dishId) {
        List<Dish> dishesByUserId = dishMapper.getDishesByUserId(dishId);
        return dishesByUserId;
    }
}
