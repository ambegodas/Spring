/**
 * @autor pathmasri
 * May 16, 2015 6:38:47 AM
 */
package com.sample.eventhandling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DemoEventHandling {
	
	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_eventhandling.xml");
		Student student = (Student)context.getBean("student");
		student.talk();
	}

}
