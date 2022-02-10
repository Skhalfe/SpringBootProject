package com.ttl.SpringBootJPACrudExample.controller;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ttl.SpringBootJPACrudExample.dao.EmployeeRepository;
import com.ttl.SpringBootJPACrudExample.model.Employee;




@RestController
public class EmployeeController {

@Autowired
private EmployeeRepository obj;

@RequestMapping("/")
String home() {
return "Hello TTL Employee -- Spring Boot!";
}

@GetMapping("/employee")
public List<Employee> getAllEmployees()
{
return obj.findAll();
}

// select * from employees where id=1005

@GetMapping("/employee/{id}") //localhost:8080/employees/1001
public Employee getEmployeeById(@PathVariable(value="id") Integer empId)
{
Optional<Employee> emp=obj.findById(empId);

return emp.get();
}
}