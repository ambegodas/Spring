/**
 * @autor pathmasri
 * May 11, 2015 7:49:57 PM
 */
package com.sample.dependancyinjection;

public class DemoDependancyInjection {
	
	public static void main(String[] a){
		
		// Dependancies are injected here to the Drawing class
		// When we use Spring, It will do this job for us
		
		Triangle traingle = new Triangle();
		Drawing drawing = new Drawing();
		drawing.setShape(traingle);
		drawing.drawShape();
	}

}
