package com.crudapi.springcrudapi.service;

import java.util.List;

import com.crudapi.springcrudapi.model.Employee;

public interface EmployeeService {
	List<Employee> getAll();
	Employee getById(int id);
	void insertEmployee(Employee employee);
	void deleteById(int id);
}
