package com.mahesh.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mahesh.Model.Employee;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/mahesh/Resources/spring.xml");

		Employee employee = (Employee) context.getBean("t1");
		// object ghetala manaje setter inection zal.
		employee.WelcomeStudent("Mahesh Patel");

	}

}
