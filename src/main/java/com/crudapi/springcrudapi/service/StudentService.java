package com.crudapi.springcrudapi.service;

import java.util.List;

import com.crudapi.springcrudapi.model.Students;

public interface StudentService {
	List<Students> getAllStudent();
	Students getById(int id);
	void insertStudent(Students students);
	void deleteStudent(int id);

}
