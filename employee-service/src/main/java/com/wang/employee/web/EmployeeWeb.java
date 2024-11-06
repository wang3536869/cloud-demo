package com.wang.employee.web;

import com.wang.employee.service.EmployeeService;
import com.wang.pojo.Employee;
import com.wang.response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeWeb {

    @Autowired
    private EmployeeService employeeService;


    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public ApiResponse<List<Employee>>getAll(){
        return ApiResponse.success(employeeService.getAll());
    }
}
