package com.wang.employee.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.pojo.Employee;

import java.util.List;

public interface EmployeeService extends IService<Employee> {


    List<Employee>getAll();
}
