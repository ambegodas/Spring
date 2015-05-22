/**
 * @autor pathmasri
 * May 22, 2015 11:11:47 AM
 */
package com.sample.jdbc.dao;


import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateDaoImple {
	
	@Autowired
	private SessionFactory sessionFactory;	

	public int getCircleCount(){		
		String hql = " select count(*) from Circle";
		Query query = getSessionFactory().openSession().createQuery(hql);		
		return ((Long)query.uniqueResult()).intValue();		
	}	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
