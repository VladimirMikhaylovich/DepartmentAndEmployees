package com.example.departmentandempl.repository;

import com.example.departmentandempl.models.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmplRepo extends JpaRepository<Employee, Integer> {

}
