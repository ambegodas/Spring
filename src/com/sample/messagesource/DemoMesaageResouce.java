/**
 * @autor pathmasri
 * May 16, 2015 5:50:56 AM
 */
package com.sample.messagesource;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMesaageResouce {
	
	public static void main(String[] args){
		
		//testMessageSource();
		testInjectingMessageSource();

	}

	/**
	 * 
	 */
	private static void testInjectingMessageSource() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_messagesource.xml");
		Student student = (Student)context.getBean("student");
		String s = student.getMessageSource().getMessage("greeting", null, "Default Greeting", Locale.ENGLISH);; 
		student.talk();
	
	}

	/**
	 * 
	 */
	private static void testMessageSource() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_messagesource.xml");
	    String s = context.getMessage("greeting", null, "Default Greeting", Locale.ENGLISH);
	    System.out.println(s);
		
	}

}
