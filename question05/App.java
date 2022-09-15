package com.question05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {


	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/question05/config.xml");
       SetterMessage sm1 = (SetterMessage)context.getBean("SM");
       System.out.println(sm1);
	}
}
