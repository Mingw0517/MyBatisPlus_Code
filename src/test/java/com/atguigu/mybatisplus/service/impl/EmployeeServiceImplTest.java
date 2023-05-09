package com.atguigu.mybatisplus.service.impl;

import com.atguigu.mybatisplus.pojo.Employee;
import com.atguigu.mybatisplus.service.EmployeeService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;


/**
 * @author Litway
 * @version 1.0
 */
@SpringBootTest
public class EmployeeServiceImplTest {

    @Autowired
    private EmployeeService employeeService;

    /**
     * 测试新增一条数据
     */
    @Test
    public void testSave() {
        Employee employee = new Employee();
        employee.setEmployeeId(207);
        employee.setFirstName("Test");
        employee.setLastName("John1");
        employee.setEmail("FHIGHA");
        employee.setPhoneNumber("515.123.8181");
        employee.setHireDate(new Date());
        employee.setJobId("AC_ACCOUNT");
        employee.setSalary(8300.00);
        employee.setManagerId(205);
        employee.setDepartmentId(110);
        employeeService.save(employee);
    }

    @Test
    public void testRemove() {
        boolean flag = employeeService.remove(new LambdaQueryWrapper<Employee>()
                .eq(Employee::getEmployeeId, 207));
        System.out.println(flag);
    }

}