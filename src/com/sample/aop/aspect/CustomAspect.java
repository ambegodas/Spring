/**
 * @autor pathmasri
 * May 17, 2015 8:21:32 AM
 */
package com.sample.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class CustomAspect {
	
	@Around("@annotation(com.sample.aop.aspect.Loggable)")
	public Object testAroundAdvice(ProceedingJoinPoint pjp){
		Object returnValue = null;
		
		try {
			System.out.println("Before advice");
			returnValue = pjp.proceed();
			System.out.println("After advice");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("After Finnaly");
		
		return returnValue;
	}

}
