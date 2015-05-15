/**
 * @autor pathmasri
 * May 12, 2015 9:31:58 PM
 */
package com.sample.autowiring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoAutoWiring {
	
	public static void main(){
	
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring_autowiring.xml");
	    Triangle traingle = (Triangle)beanFactory.getBean("triangle");
	    traingle.draw();
	}

}
