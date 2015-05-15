/**
 * @autor pathmasri
 * May 13, 2015 10:42:19 PM
 */
package com.sample.beaninheritence;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DemoBeanInheritence {
	
	public static void main(String[] args){
		
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring_beaninheritence.xml");
	    Triangle traingle = (Triangle)beanFactory.getBean("triangle");	    
	    System.out.print(traingle.getPointA().getX());		
	}

}
