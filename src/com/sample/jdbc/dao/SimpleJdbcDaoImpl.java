/**
 * @autor pathmasri
 * May 22, 2015 9:22:48 AM
 */
package com.sample.jdbc.dao;

import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class SimpleJdbcDaoImpl extends SimpleJdbcDaoSupport {
	
	public int getCircleCount(){
		String sql = "select count(*) from Circle";
		return this.getJdbcTemplate().queryForInt(sql);	
	}

}
