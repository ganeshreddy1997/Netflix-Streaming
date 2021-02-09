package io.springboot2.x.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class NetflixUserEntity {
	
	@Id
	private String phoneNor;
	private String userName;
	private String email;
	private String password;
	private String plan;
	
	public String getPhoneNor() {
		return phoneNor;
	}
	public void setPhoneNor(String phoneNor) {
		this.phoneNor = phoneNor;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	

}
