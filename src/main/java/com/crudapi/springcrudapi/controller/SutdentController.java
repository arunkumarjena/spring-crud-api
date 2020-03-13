package com.crudapi.springcrudapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudapi.springcrudapi.model.Students;
import com.crudapi.springcrudapi.service.StudentService;

@RestController
@RequestMapping("/students/api/v1")
public class SutdentController {
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/all_students")
	public List<Students> getAllStudents(){ 
		return studentService.getAllStudent();
	}
	@PostMapping("/students/add")
	public Students insertStudents(@RequestBody Students studentsObject) {
		studentService.insertStudent(studentsObject);
		return studentsObject;
	}
	@GetMapping("/student/{id}")
	public Students getStudentById(@PathVariable int id) {
		Students studentObject = studentService.getById(id);
		if(studentObject == null) {
			throw new RuntimeException("Student id"+id+"does not exist");
		}
		return studentObject;
	}

	@DeleteMapping("/student/{id}")
	public String deleteEmpById(@PathVariable int id) {
		studentService.deleteStudent(id);
		return "Student is deleted by given id!"+id;
	}
	@PutMapping("/students")
	public Students updateStudents(@RequestBody Students studentsObject) {
		studentService.insertStudent(studentsObject);
		return studentsObject;
		
	}


}
