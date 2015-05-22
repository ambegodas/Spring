/**
 * @autor pathmasri
 * May 16, 2015 1:16:32 PM
 */
package com.sample.aop.model;

public class Circle {

	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 * @throws Exception 
	 */
	public void setName(String name) {
		
		System.out.println("Setter got called");
		this.name = name;
		throw new RuntimeException();
	}
	
	public String setNameAndReturn(String name) {
		
		System.out.println("Setter got called");
		this.name = name;
		return "Changed";
	}
	
}
