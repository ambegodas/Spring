/**
 * @autor pathmasri
 * May 12, 2015 10:26:08 PM
 */
package com.sample.beanscopes;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoBeanScopes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BeanFactory beanfactory = new ClassPathXmlApplicationContext("spring_beanscopes.xml");
        Student student1 = (Student)beanfactory.getBean("student");
        student1.setName("wathsala");       
        System.out.print(student1.getName());
        
        Student student2 = (Student)beanfactory.getBean("student");
        
        System.out.print(student2.getName());
        
        
	}

}
