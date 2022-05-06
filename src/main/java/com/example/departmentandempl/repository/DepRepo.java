package com.example.departmentandempl.repository;

import com.example.departmentandempl.models.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepRepo extends JpaRepository<Department, Integer> {
}
