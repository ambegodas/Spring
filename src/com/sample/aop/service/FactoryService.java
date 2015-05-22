/**
 * @autor pathmasri
 * May 18, 2015 10:23:18 PM
 */
package com.sample.aop.service;

import com.sample.aop.model.Circle;
import com.sample.aop.model.Traingle;

public class FactoryService {
	
	public Object getBean(String beanType){
		
		if(beanType.equals("ShapeService")) return new ShapeServiceProxy();
		if(beanType.equals("Circel")) return new Circle();
		if(beanType.equals("Triangle")) return new Traingle();
		
		return null;
		
	}

}
