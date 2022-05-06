package com.example.departmentandempl.service;

import com.example.departmentandempl.models.entity.Department;
import com.example.departmentandempl.repository.DepRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImplementation implements DepartmentService{
    @Autowired
    private DepRepo repository;

    @Override
    public List<Department> showAllDepartments() {
        return repository.findAll();
    }

    @Override
    public Department showDepartment(int id) {
        return repository.getById(id);
    }

    @Override
    public Department addDepartment(Department department) {

        return repository.save(department);
    }

    @Override
    public Department updateDepartment(Department department) {
        return repository.save(department);
    }

    @Override
    public void deleteDepartment(int id) {
      repository.delete(repository.getById(id));
    }
}
