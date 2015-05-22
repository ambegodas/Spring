/**
 * @autor pathmasri
 * May 16, 2015 6:39:05 AM
 */
package com.sample.eventhandling;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListner implements ApplicationListener {
	@Override
	public void onApplicationEvent(ApplicationEvent arg0) {
	System.out.println(arg0);		
	}
}
