package com.example.departmentandempl.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "department")
public class Department {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "id")
     private int id;

     @Column(name = "department_name")
     private String name;

     @Column(name = "size_of_department")
     private int size;

     @Column(name ="task")
     private String task;


     @JsonIgnore
     @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
     private List<Employee> employeeList;

     public void  addEmployeeToDep(Employee employee){
          if(employeeList == null)
               employeeList = new ArrayList<>();
          employeeList.add(employee);
          employee.setDepartment(this);

     }



}
