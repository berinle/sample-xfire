package com.berinle;

import java.util.Date;

public class Employee {
	private String firstName;
	private String lastName;
	private String userName;
	private String employeeNo;
	private Date dob;
	//private Date createdDate;
	//private Date lastUpdated;
	
	public String getFirstName(){
		return firstName;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public String getUserName(){
		return userName;
	}
	
	public void setUserName(String userName){
		this.userName = userName;
	}
	
	public String getEmployeeNo(){
		return employeeNo;
	}
	
	public void setEmployeeNo(String employeeNo){
		this.employeeNo = employeeNo;
	}
	
	public Date getDob(){
		return dob;
	}
	
	public void setDob(Date dob){
		this.dob = dob;
	}
		
}