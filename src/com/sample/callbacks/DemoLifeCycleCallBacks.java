/**
 * @autor pathmasri
 * May 13, 2015 11:49:54 PM
 */
package com.sample.callbacks;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoLifeCycleCallBacks {
	
	public static void main(String[] args){
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring_lifecyclecallbacks.xml");
		context.registerShutdownHook();
		
	}

}
