package com.example.EmployeeSystem;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeSystem.EmployeeDTO;
import com.example.EmployeeSystem.EmployeeRepository;

@Service
public class EmployeeServiceImp implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public EmployeeDTO createEmployee(EmployeeDTO employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<EmployeeDTO> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public EmployeeDTO getEmployee(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public String deleteEmployee(int id) {
        employeeRepository.deleteById(id);
        return "Delete Successfully";
    }
}

