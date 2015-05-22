/**
 * @autor pathmasri
 * May 18, 2015 10:50:40 PM
 */
package com.sample.aop.service;

import com.sample.aop.aspect.LoginAspect;
import com.sample.aop.model.Circle;

public class ShapeServiceProxy extends ShapeService{
	public Circle getCircle() {
        new LoginAspect().loginAdvice8();
		return super.getCircle();
	}
}
