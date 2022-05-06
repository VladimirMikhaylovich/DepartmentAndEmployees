package com.example.departmentandempl.web;

import com.example.departmentandempl.models.entity.Department;
import com.example.departmentandempl.models.entity.Employee;
import com.example.departmentandempl.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employees")
    public Employee add(@RequestBody Employee employee){
       return employeeService.addEmployee(employee);
    }
    @DeleteMapping("employees/{id}")
    public String delete(@PathVariable int id){
        employeeService.deleteEmployee(id);
        return "Сотрудник "+id+" удален";
    }
    @GetMapping("/employees")
    public List<Employee> showAllEmployees(){
       return employeeService.showAllEmployees();
    }

    @GetMapping("employees/{id}")
    public Employee showEmployee(@PathVariable int id){
       return employeeService.showEmployee(id);
    }

}
