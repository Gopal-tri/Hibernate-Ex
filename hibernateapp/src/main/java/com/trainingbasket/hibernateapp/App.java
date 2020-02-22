package com.trainingbasket.hibernateapp;

import javax.rmi.CORBA.Stub;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.trainingbasket.hibernateapp.beans.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		System.out.println("Test Save Operation: ");

		Student student = new Student();
		student.setAge(25);
		student.setName("Krishna");
		student.setContact("4339874359");

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(student);	//Insert
		session.getTransaction().commit();
		session.close();

		System.out.println("Data Successfully Inserted ");

	}
}
