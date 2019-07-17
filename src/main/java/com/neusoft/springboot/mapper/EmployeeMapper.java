package com.neusoft.springboot.mapper;

import com.neusoft.springboot.bean.Employee;
import org.springframework.stereotype.Component;

//@Mapper或者@MapperScan将接口扫描装配到容器中
@Component
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
