/**
 * @autor pathmasri
 * May 18, 2015 7:49:52 AM
 */
package com.sample.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Pointcut;


public class LoginAspectXmlConfig {
	
	

	public void testAdvice(){
		System.out.println("Advice running from XML configs");
	}


}
