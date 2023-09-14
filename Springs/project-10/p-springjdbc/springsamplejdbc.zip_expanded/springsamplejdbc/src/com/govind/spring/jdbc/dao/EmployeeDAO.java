package com.govind.spring.jdbc.dao;

import java.util.List;

import com.govind.spring.jdbc.model.Employee789;

public interface EmployeeDAO {

	Employee789 getEmployeeByNo(Integer eno);

	List<Employee789> getAllEmployees();

	boolean deleteEmployee(Employee789 ee);

	boolean updateEmployee(Employee789 ee);

	boolean createEmployee(Employee789 ee);

}
