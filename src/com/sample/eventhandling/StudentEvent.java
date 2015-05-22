/**
 * @autor pathmasri
 * May 16, 2015 6:55:27 AM
 */
package com.sample.eventhandling;

import org.springframework.context.ApplicationEvent;

public class StudentEvent extends ApplicationEvent {
	/**
	 * @param source
	 */
	public StudentEvent(Object source) {
		super(source);		
	}

	 public String toString(){		 
		 return "student event occured";
	 }
}
