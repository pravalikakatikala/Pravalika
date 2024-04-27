package com.example.EmployeeSystem;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class Controller {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/createemployee")
    public EmployeeDTO create(@RequestBody EmployeeDTO employeeDTO) {
        return employeeService.createEmployee(employeeDTO);
    }

    @GetMapping("/getAll")
    public List<EmployeeDTO> getAll() {
        return employeeService.getAllEmployee();
    }

    @GetMapping("/getbyid")
    public EmployeeDTO getById(@PathVariable int id) {
        return employeeService.getEmployee(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable int id) {
        return employeeService.deleteEmployee(id);
    }
}