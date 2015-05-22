/**
 * @autor pathmasri
 * May 16, 2015 2:44:11 AM
 */
package com.sample.messagesource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private String name = "Pathmasri";
	private int age = 30;
	
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

	@Autowired
	private MessageSource messageSource;

	/**
	 * @return the messageSource
	 */
	public MessageSource getMessageSource() {
		return messageSource;
	}

	/**
	 * @param messageSource the messageSource to set
	 */
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
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
		String s = this.messageSource.getMessage("student.talk", new Object[] {this.name,this.age},"default Message",null);
		System.out.println(s);
	}

}
