package com.example.departmentandempl.web;

import com.example.departmentandempl.models.entity.Department;
import com.example.departmentandempl.models.entity.Employee;
import com.example.departmentandempl.service.DepartmentService;
import com.example.departmentandempl.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class DepartmentController {

    @Autowired
   private DepartmentService departmentService;
@Autowired
    private EmployeeService employeeService;

   @PostMapping("/add")
   public Department addDepartment(@RequestBody Department department){
     return departmentService.addDepartment(department);
   }
   @DeleteMapping("/delete/{id}")
   public String delete(@PathVariable int id){
    departmentService.deleteDepartment(id);
    return "Department "+id+" is deleted";
   }

   @GetMapping("departments")
   public List<Department> showAll(){
    List<Department> list = departmentService.showAllDepartments();
       return list;
   }


   @GetMapping("departments/{id}")
   public Department showDepartment(@PathVariable int id){
       return departmentService.showDepartment(id);
   }

   @PutMapping("update")
   public String update(@RequestBody Department department){
       departmentService.updateDepartment(department);
       return "Department "+department.getName()+" is updated";
   }
  @PutMapping("/{departmentId}/employee/{employeeId}")
   public Department addEmployeeToDepartment(
           @PathVariable int departmentId,
           @PathVariable int employeeId
   ){
     Department department = departmentService.showDepartment(departmentId);
      Employee employee = employeeService.showEmployee(employeeId);
      department.addEmployeeToDep(employee);

       return departmentService.updateDepartment(department);
   }

}
