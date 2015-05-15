/**
 * @autor pathmasri
 * May 11, 2015 10:47:49 PM
 */
package com.sample.injectinobjects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DemoInjectingObjects {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//tetsObjectInjection();
		//testInnerBeans();
		testIdRef();
		testAlias();
	}
	
	/**
	 * 
	 */
	
	private static void testAlias() {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring_injectingObjects.xml");
		Triangle traingle = (Triangle)appContext.getBean("triangle3");
		traingle.draw();
		
	}
	
	private static void testIdRef() {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring_injectingObjects.xml");
		Triangle traingle = (Triangle)appContext.getBean("triangle3");
		traingle.draw();
		
	}

	private static void tetsObjectInjection(){
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring_injectingObjects.xml");
		Triangle traingle = (Triangle)appContext.getBean("triangle");
		traingle.draw();
	}
	
	private static void testInnerBeans(){
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring_injectingObjects.xml");
		Triangle traingle = (Triangle)appContext.getBean("triangle1");
		traingle.draw();
	}

}
