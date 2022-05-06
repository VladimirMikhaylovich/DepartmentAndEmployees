package com.example.departmentandempl.service;

import com.example.departmentandempl.models.entity.Department;

import java.util.List;

public interface DepartmentService {
    public List<Department> showAllDepartments();

    public Department showDepartment(int id);

    public  Department addDepartment(Department department);

    public Department updateDepartment(Department department);

    public void deleteDepartment(int id);

}
