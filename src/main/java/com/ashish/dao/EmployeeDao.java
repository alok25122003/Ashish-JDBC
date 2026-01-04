package com.ashish.dao;

import java.util.List;

import com.ashish.entity.Employee;

public interface EmployeeDao {
	
	
	
	public void saveEmp(Employee e);
	
	public void updateEmp(Employee e);
	
	public void deleteEmpById(int id);
	
	public Employee getEmpByID(int id);
	
	public Employee getEmpByName(String name);
	
	public List<Employee> getAllEmps();
	
	public void printAllEmps();
}
