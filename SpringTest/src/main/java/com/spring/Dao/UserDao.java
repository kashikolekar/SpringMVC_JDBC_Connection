package com.spring.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.Model.User;

@Repository
public class UserDao {
	
	
	private JdbcTemplate jdbcTemplate;
	


	/**
	 * @return the jdbcTemplate
	 */
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}



	/**
	 * @param jdbcTemplate the jdbcTemplate to set
	 */
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



	public int saveUser(User user) {
		// TODO Auto-generated method stub
		String sql = "insert into user(name,email,pass) values(?,?,?)";
		int i = jdbcTemplate.update(sql,user.getName(),user.getEmail(),user.getPass());
		return i;
		
	}

	
}
