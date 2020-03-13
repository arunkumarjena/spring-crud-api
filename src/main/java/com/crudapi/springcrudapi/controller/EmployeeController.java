package com.crudapi.springcrudapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudapi.springcrudapi.model.Employee;
import com.crudapi.springcrudapi.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/emplist")
	public List<Employee> getAll() {
		return employeeService.getAll();

	}

	@PostMapping("/employee/insert")
	public Employee insertEmployee(@RequestBody Employee employeeObj) {
		employeeService.insertEmployee(employeeObj);
		return employeeObj;
	}

	@GetMapping("/employee/{id}")
	public Employee getEmpById(@PathVariable int id) {
		Employee employeeObj = employeeService.getById(id);
		if(employeeObj == null) {
			throw new RuntimeException("Employee id"+id+"does not exist");
		}
		return employeeObj;
	}

	@DeleteMapping("/employee/{id}")
	public String deleteEmpById(@PathVariable int id) {
		employeeService.deleteById(id);
		return "Employee is deleted by given id!"+id;
	}
	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee employeeObj) {
		employeeService.insertEmployee(employeeObj);
		return employeeObj;
		
	}
}
