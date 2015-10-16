package com.akelius.propertyapp.dao;

import java.util.Collection;

import org.hibernate.classic.Session;

import com.akelius.propertyapp.persistence.HibernateUtil;

public class QuestionDAOImpl<Question, Integer> implements QuestionDAO<Question, Integer> {
	Session session = HibernateUtil.getSessionFactory().openSession();		

	public Collection<Question> getAll() {
		return session.createQuery("from Question").list();
	}

	public Question getOne(Integer key) {
		// TODO
		return (Question) session.createQuery("from Question").list().get(0);
//		return null;
	}

	public void updateOne(Integer key) {
		// TODO Auto-generated method stub
		
	}

	public void deleteOne(Integer key) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
