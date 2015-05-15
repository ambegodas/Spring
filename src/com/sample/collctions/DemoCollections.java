/**
 * @autor pathmasri
 * May 12, 2015 9:09:58 PM
 */
package com.sample.collctions;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoCollections {
	
	public static void main(){
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring_collections.xml");
		Triangle triangel = (Triangle)beanFactory.getBean("triangle");
		triangel.draw();
	}

}
