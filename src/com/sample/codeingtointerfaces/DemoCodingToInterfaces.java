/**
 * @autor pathmasri
 * May 15, 2015 12:52:28 PM
 */
package com.sample.codeingtointerfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoCodingToInterfaces {
	
	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_codingtointerfaces.xml");
		Shape shape1 = (Shape)context.getBean("traingle");
        shape1.draw();
        
        Shape shape2 = (Shape)context.getBean("circle");
        shape2.draw();
        
        /*
         * Since circle and traingle are implemented the Shape interface, no code changes need to be done to draw them.
         * If you add a new shape, you can draw it without any code changes in java code.
         * You just need to define it in the xml..
         */
        
	}

}
