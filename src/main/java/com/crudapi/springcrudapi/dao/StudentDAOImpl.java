package com.crudapi.springcrudapi.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crudapi.springcrudapi.model.Employee;
import com.crudapi.springcrudapi.model.Students;
@Repository
public class StudentDAOImpl implements StudentDAO {
	@Autowired
	private EntityManager entityManager;
	@Override
	public List<Students> getAllStudent() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Students> query = currentSession.createQuery("from Students",Students.class);
		List<Students> list = query.getResultList();
		return list;
	}

	@Override
	public Students getById(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Students studentObject = currentSession.get(Students.class, id);
		return studentObject;
	}

	@Override
	public void insertStudent(Students students) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(students);
	}

	@Override
	public void deleteStudent(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Students studentObject = currentSession.get(Students.class, id);
		currentSession.delete(studentObject);

	}

}
