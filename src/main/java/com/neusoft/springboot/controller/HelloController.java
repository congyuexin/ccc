package com.neusoft.springboot.controller;

import com.neusoft.springboot.bean.Employee;
import com.neusoft.springboot.bean.Person;
import com.neusoft.springboot.mapper.EmployeeMapper;
import com.neusoft.springboot.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.List;
import java.util.Map;

@Controller
public class HelloController {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    EmployeeMapper employeeMapper;

    @ResponseBody
    @GetMapping("/query")
    public String  map(){
        Employee emp = employeeMapper.getEmpById(1);
        return emp.toString();
    }
}
