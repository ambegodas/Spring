/**
 * @autor pathmasri
 * May 19, 2015 8:17:23 AM
 */
package com.sample.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

import com.sample.jdbc.model.*;

@Component
public class JdbcDaoImpl {
	
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate ;
	private NamedParameterJdbcTemplate nameParameterJdbcTemplate;
	
	
	/**
	 * @return the dataSource
	 */
	public DataSource getDataSource() {
		return dataSource;
	}


	/**
	 * @param dataSource the dataSource to set
	 */
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.nameParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
		this.dataSource = dataSource; //this is not required. Did it make other examples work
	}


	public Circle getCircle(int circleId){	
		Connection connection = null;
		Circle circle = null;
		String driver = "com.mysql.jdbc.Driver";
		try {
			Class.forName(driver).newInstance();
			connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/Spring","root","password1234");
			
			PreparedStatement ps = connection
					.prepareStatement("select * from Circle where circleId = ?");
			ps.setInt(1, circleId);
			ResultSet resultSet = ps.executeQuery();

			if (resultSet.next()) {
				circle = new Circle(circleId, resultSet.getString("name"));
			}

		} catch (Exception e) {
          e.printStackTrace();
		}
		 finally{
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		 }
		return circle;
	}
	
	public Circle getCircleSpring(int circleId) {
		Connection connection = null;
		Circle circle = null;
		try {
			connection = dataSource.getConnection();
			PreparedStatement ps = connection
					.prepareStatement("select * from Circle where circleId = ?");
			ps.setInt(1, circleId);
			ResultSet resultSet = ps.executeQuery();

			if (resultSet.next()) {
				circle = new Circle(circleId, resultSet.getString("name"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return circle;
	}
	
	public int getCircleCount(){
		String sql = "select count(*) from Circle";
		return jdbcTemplate.queryForInt(sql);
	}
	
	public String getCircleName(int circleId){
		String sql = "select name from Circle where circleId = ?";
		return jdbcTemplate.queryForObject(sql, new Object[]{circleId},String.class);
	}
	
	public Circle getCircle1(int circleId){
		String sql = "select * from Circle where circleId = ?";
		return jdbcTemplate.queryForObject(sql, new Object[]{circleId}, new CircleMapper());
	}
	
	public List<Circle> getCircles(int circleId){
		String sql = "select * from Circle";
		return jdbcTemplate.query(sql, new CircleMapper());
	}
	
	private static final class CircleMapper implements RowMapper<Circle> {
		public Circle mapRow(ResultSet resultSet, int arg1) throws SQLException {
			Circle circle = new Circle();
			circle.setCircleId(resultSet.getInt("circleId"));
			circle.setName(resultSet.getString("name"));
			return circle;
		}		
	}
	
	public void insertCircle(Circle c){
		String sql = "Insert into Circle values(?,?)";
		jdbcTemplate.update(sql,new Object[]{c.getCircleId(),c.getName()});
	}
	
	public void insertCircleUsingNamedParameters(Circle c){
		String sql = "Insert into Circle values(:id,:name)";
		SqlParameterSource namedParameters = new MapSqlParameterSource("id",c.getCircleId()).addValue("name", c.getName());
		nameParameterJdbcTemplate.update(sql,namedParameters);
	}
	
	public void createTable(){
		String sql = "CREATE TABLE TRAINGLE (ID INTEGER, NAME VARCHAR(50))";
		jdbcTemplate.execute(sql);
	}

}
