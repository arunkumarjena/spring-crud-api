package com.crudapi.springcrudapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crudapi.springcrudapi.dao.StudentDAO;
import com.crudapi.springcrudapi.model.Students;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentDAO studentDao;
	
	@Transactional
	@Override
	public List<Students> getAllStudent() {
		return studentDao.getAllStudent();
	}
	
	@Transactional
	@Override
	public Students getById(int id) {
		return studentDao.getById(id);
	}

	@Transactional
	@Override
	public void insertStudent(Students students) {
		studentDao.insertStudent(students);
	}
	
	@Transactional
	@Override
	public void deleteStudent(int id) {
		studentDao.deleteStudent(id);
	}

}
