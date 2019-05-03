package com.mahesh.mainApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mahesh.Model.Employee;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee employee=(Employee)context.getBean("t1");
		employee.displayStudentInfo();
		System.out.println("First Name: "+employee.getFname());
		System.out.println("Middle Name: "+employee.getMname());
		System.out.println("Last Name: "+employee.getLname());
	}

}
