/**
 * @autor pathmasri
 * May 16, 2015 11:03:59 PM
 */
package com.sample.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LOginAspectAround {
	
	@Pointcut("execution(* get*())")
	 public void allGetters(){}
	
	@Around("allGetters()")
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
