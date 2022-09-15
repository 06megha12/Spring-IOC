package com.question02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

			ApplicationContext context=new ClassPathXmlApplicationContext("com/question02/config.xml");
			PrintMessage e=(PrintMessage) context.getBean("print");
			System.out.println(e);
		
	}

}
