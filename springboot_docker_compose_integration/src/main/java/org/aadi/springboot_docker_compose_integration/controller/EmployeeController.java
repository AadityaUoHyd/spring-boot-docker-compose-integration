package org.aadi.springboot_docker_compose_integration.controller;

import lombok.RequiredArgsConstructor;
import org.aadi.springboot_docker_compose_integration.entity.Employee;
import org.aadi.springboot_docker_compose_integration.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    @PostMapping
    public String add(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return "Employee added";
    }

    @GetMapping
    public List<Employee> getAll(){
        return employeeRepository.findAll();
    }

    @GetMapping("/test")
    public String test(){
        return "testing code";
    }
}
