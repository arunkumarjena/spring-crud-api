package com.crudapi.springcrudapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crudapi.springcrudapi.dao.EmployeeDAO;
import com.crudapi.springcrudapi.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDAO employeeDao;

	@Transactional
	@Override
	public List<Employee> getAll() {
		return employeeDao.getAll();
	}

	@Transactional
	@Override
	public Employee getById(int id) {
		return employeeDao.getById(id);
	}

	@Transactional
	@Override
	public void insertEmployee(Employee employee) {
		employeeDao.insertEmployee(employee);
	}

	@Transactional
	@Override
	public void deleteById(int id) {
		employeeDao.deleteById(id);
	}

}
