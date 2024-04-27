package com.example.EmployeeSystem;

import java.util.List;

import com.example.EmployeeSystem.EmployeeDTO;


public interface EmployeeService {

	public EmployeeDTO createEmployee(EmployeeDTO employee);
	public EmployeeDTO getEmployee(int id);
	public String deleteEmployee(int id);
	List<EmployeeDTO> getAllEmployee();
	
}
