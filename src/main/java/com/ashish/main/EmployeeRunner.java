package com.ashish.main;

/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
*/
import com.ashish.dao.EmployeeDao;
import com.ashish.dao.EmployeeDaoImpl;
import com.ashish.entity.Employee;
import com.mysql.cj.jdbc.Driver;
 
public class EmployeeRunner {

	//public static void main(String[] args) throws SQLException {
	
	//*way=1*//	
		//presistent opject
		
	//	Employee sumit = new Employee(11, "sumit Gupta", "Male", 67000);

	    // Employee ravi = new Employee(10, "Ravi Gupta", "Male", 67000);
	
		//Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "abhi123");

		//Statement statement = connection.createStatement();

	//statement.executeUpdate("insert into employee(id,name,gender,salary) values (" + ravi.getId()+ ",'"+ravi.getName()+"','"+ravi.getGender()+"',"+ravi.getSalary()+")");
   
		//*one line code*//
		
		//DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "abhi123").createStatement().executeUpdate("insert into employee(id,name,gender,salary) values (" + sumit.getId()+ ",'"+sumit.getName()+"','"+sumit.getGender()+"',"+sumit.getSalary()+")");
		
		
		//System.out.println("insert into employee(id,name,gender,salary) values (" + sumit.getId()+ ",'"+sumit.getName()+"','"+sumit.getGender()+"',"+sumit.getSalary()+")");
	 //   System.out.println("Query executed...............");

		
		//way-2//
	/*
		Employee aman = new Employee(12, "aman Gupta", "Male", 77000);
		
		Properties ps = new Properties();
		ps.put("user","root");
		ps.put("password", "abhi123");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb",ps );

		Statement statement = connection.createStatement();
		
		statement.executeUpdate("insert into employee(id,name,gender,salary) values (" + aman.getId()+ ",'"+aman.getName()+"','"+aman.getGender()+"',"+aman.getSalary()+")");
	
	
		System.out.println("insert into employee(id,name,gender,salary) values (" + aman.getId()+ ",'"+aman.getName()+"','"+aman.getGender()+"',"+aman.getSalary()+")");
		System.out.println("Query executed...............");
*/ 
		//*way-3*//
	/*	
		Employee avinav = new Employee(13, "avinav singh", "Male", 97000);
		
		Properties ps = new Properties();
		ps.put("user","root");
		ps.put("password", "abhi123");
		
	    
	    
	    Connection connection =new Driver().connect("jdbc:mysql://localhost:3306/mydb",ps );

		Statement statement = connection.createStatement();
		
		statement.executeUpdate("insert into employee(id,name,gender,salary) values (" + avinav.getId()+ ",'"+avinav.getName()+"','"+avinav.getGender()+"',"+avinav.getSalary()+")");
	
	
		System.out.println("insert into employee(id,name,gender,salary) values (" + avinav.getId()+ ",'"+avinav.getName()+"','"+avinav.getGender()+"',"+avinav.getSalary()+")");
		System.out.println("Query executed...............");
*/
	
	public static void main(String[] args) {
		EmployeeDao edao = new EmployeeDaoImpl();
		
		Employee sumit = new Employee(4, "Dhairya", "female", 97000);
        
		
	}
	}

