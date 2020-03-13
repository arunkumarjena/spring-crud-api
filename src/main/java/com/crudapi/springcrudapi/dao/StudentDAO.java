package com.crudapi.springcrudapi.dao;

import java.util.List;

import com.crudapi.springcrudapi.model.Students;

public interface StudentDAO {
	List<Students> getAllStudent();
	Students getById(int id);
	void insertStudent(Students students);
	void deleteStudent(int id);

}
