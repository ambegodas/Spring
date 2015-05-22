/**
 * @autor pathmasri
 * May 16, 2015 2:44:11 AM
 */
package com.sample.eventhandling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Student implements ApplicationEventPublisherAware{
	private String name = "Pathmasri";
	private int age = 30;
	
	private ApplicationEventPublisher eventPublisher;
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}





	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */

	public void setName(String name) {
		this.name = name;
	}
	
    public void talk(){
    	StudentEvent event = new StudentEvent(this);
    	eventPublisher.publishEvent(event);
    }

	/* (non-Javadoc)
	 * @see org.springframework.context.ApplicationEventPublisherAware#setApplicationEventPublisher(org.springframework.context.ApplicationEventPublisher)
	 */
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher arg0) {
		this.eventPublisher = arg0;
		
	}

}
