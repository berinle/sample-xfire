package com.berinle;

import java.util.Date;
import java.text.*;


public class EmployeeServiceImpl implements EmployeeService {
	
	public static String PATTERN = "MM/dd/yy HH:mm:ss";
			
	public void addEmployee(Employee e) {
		System.out.println("add employee called." + e);
		DateFormat df = new SimpleDateFormat(PATTERN);
		
		try {
			Date myDate = df.parse(e.getDobAsString());
			System.out.println("successfully parsed date: " + myDate);	
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			// expression
		}		
	}
	
}