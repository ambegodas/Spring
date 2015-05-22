/**
 * @autor pathmasri
 * May 16, 2015 2:44:11 AM
 */
package com.sample.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	@Autowired
	public void setName(String name) {
		this.name = name;
	}

}
