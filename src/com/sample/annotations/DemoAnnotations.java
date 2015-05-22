/**
 * @autor pathmasri
 * May 15, 2015 3:34:44 PM
 */
package com.sample.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoAnnotations {
	
	public static void main(String[] a){		
		//testRequiredAnnotation();
		//testAutowiredAnnotation();
		//testQualifireAnnotation();
		//testResourceAnnotation();
		//testJSRannotations();
		testComponentAnnotation();
				
	}

	/**
	 * 
	 */
	private static void testComponentAnnotation() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_annotations.xml");
		Student student = (Student)context.getBean("student");
		System.out.println(student.getName());		
	}

	/**
	 * 
	 */
	private static void testJSRannotations() {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring_annotations.xml");
		context.registerShutdownHook();
		Shape shape = (Shape)context.getBean("triangel");
		shape.draw();
		
	}

	/**
	 * 
	 */
	private static void testResourceAnnotation() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_annotations.xml");
		Shape shape = (Shape)context.getBean("triangel");
		shape.draw();
		
	}

	/**
	 * 
	 */
	private static void testQualifireAnnotation() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_annotations.xml");
		Shape shape = (Shape)context.getBean("triangel");
		shape.draw();
		
	}

	/**
	 * 
	 */
	private static void testAutowiredAnnotation() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_annotations.xml");
		Shape shape = (Shape)context.getBean("triangel");
		shape.draw();
		
	}

	/**
	 * 
	 */
	private static void testRequiredAnnotation() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_annotations.xml");
		Shape shape = (Shape)context.getBean("circle");
		shape.draw();
		
	}

}
