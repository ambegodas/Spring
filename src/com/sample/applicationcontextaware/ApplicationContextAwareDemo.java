/**
 * @autor pathmasri
 * May 12, 2015 10:53:55 PM
 */
package com.sample.applicationcontextaware;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextAwareDemo {
	
	public static void main(String[] a){
		
		BeanFactory beanfactory = new  ClassPathXmlApplicationContext("spring_applicationcontextaware.xml");
	    Triangle triangle = (Triangle)beanfactory.getBean("triangle");
	    triangle.getPointA().setX(100);
	    
	    Point pointA = (Point)beanfactory.getBean("pointA");
	    System.out.println(pointA.getX());
	    
	    Point p = (Point)triangle.getContext().getBean("pointA");
	    System.out.println(p.getX());
	    
	    Point p1 = (Point)triangle.getPointA();
	    
	    System.out.println(p1.getX());
	    
	    
	}

}
