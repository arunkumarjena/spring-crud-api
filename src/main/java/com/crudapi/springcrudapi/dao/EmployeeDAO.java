package com.crudapi.springcrudapi.dao;

import java.util.List;

import com.crudapi.springcrudapi.model.Employee;

public interface EmployeeDAO {
	List<Employee> getAll();
	Employee getById(int id);
	void insertEmployee(Employee employee);
	void deleteById(int id);
}
