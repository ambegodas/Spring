/**
 * @autor pathmasri
 * May 14, 2015 12:30:04 AM
 */
package com.sample.beanpostprocessor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DemoBeanPostProcessor {
	
	public static void main(String[] args){	    
	    testPostProcessors();
	    //testPropertyPlaceHolder();
	}

	/**
	 * 
	 */
	private static void testPropertyPlaceHolder() {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring_beanpostprocessor.xml");
	    Triangle traingle = (Triangle)beanFactory.getBean("triangle");	    
	    System.out.println(traingle.getPointA().getX());	
	    System.out.println(traingle.getPointA().getY());	
		
	}

	/**
	 * 
	 */
	private static void testPostProcessors() {
		
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring_beanpostprocessor.xml");
	    Triangle traingle = (Triangle)beanFactory.getBean("triangle");	    
	    System.out.print(traingle.getPointA().getX());	
		
	}
	
	

}
