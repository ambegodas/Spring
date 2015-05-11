/**
 * @autor pathmasri
 * May 11, 2015 8:45:03 PM
 */
package com.sample.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DemoBeanFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//testBeanFactory();
		//testApplicaitonContext();
		testConstructorInjection();
		
	}

	/**
	 * 
	 */
	private static void testConstructorInjection() {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
		Triangle traingle = (Triangle)appContext.getBean("triangle3");
		System.out.println("Type is : "+ traingle.getType());
		System.out.println("Height is : "+ traingle.getHeight());
		traingle.draw();
		
	}

	/**
	 * 
	 */
	private static void testApplicaitonContext() {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
		Triangle traingle = (Triangle)appContext.getBean("triangle");
		System.out.println(traingle.getType());
		traingle.draw();
	}

	/**
	 * 
	 */
	private static void testBeanFactory() {
		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle traingle = (Triangle)beanFactory.getBean("triangle");
		traingle.draw();
		
	}

}
