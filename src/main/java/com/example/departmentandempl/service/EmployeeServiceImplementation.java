package com.example.departmentandempl.service;

import com.example.departmentandempl.models.entity.Department;
import com.example.departmentandempl.models.entity.Employee;
import com.example.departmentandempl.repository.EmplRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImplementation implements EmployeeService {
    @Autowired
    private EmplRepo repository;

    @Override
    public List<Employee> showAllEmployees() {
        return repository.findAll();
    }

    @Override
    public Employee showEmployee(int id) {
        return repository.getById(id);
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public void deleteEmployee(int id) {
     repository.deleteById(id);
    }
}
