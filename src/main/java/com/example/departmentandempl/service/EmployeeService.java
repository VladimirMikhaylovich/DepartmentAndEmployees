package com.example.departmentandempl.service;

import com.example.departmentandempl.models.entity.Department;
import com.example.departmentandempl.models.entity.Employee;
import org.apache.catalina.LifecycleState;

import java.util.List;

public interface EmployeeService {
    public List<Employee> showAllEmployees();

    public Employee showEmployee(int id);

    public Employee addEmployee(Employee employee);
    public Employee updateEmployee(Employee employee);

    public void deleteEmployee(int id);
}
