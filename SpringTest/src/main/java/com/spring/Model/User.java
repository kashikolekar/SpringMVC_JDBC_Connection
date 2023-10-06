package com.spring.Model;



//@Entity
public class User {
	
	//@Id
	
	private int id;
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	private String email;
	private String name;
	private String pass;
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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
	/**
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}
	/**
	 * @param pass the pass to set
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", name=" + name + ", pass=" + pass + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String email, String name, String pass) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.pass = pass;
	}
	
	

}
