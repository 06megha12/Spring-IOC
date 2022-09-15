package com.question01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/question01/config.xml");
		Employee e=(Employee) context.getBean("employee");
		System.out.println(e);

	}
}
