package com.govind.spring.jdbc.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.govind.spring.jdbc.model.Employee789;
import com.govind.spring.jdbc.model.EmployeeMapper;

public class EmployeeDAOImpl implements EmployeeDAO {
	JdbcTemplate jdbcTemplate;

	private final String SQL_FIND_EMPLOYEE = "select * from employee789 where empno = ?";
	private final String SQL_DELETE_EMPLOYEE = "delete from employee789 where empno = ?";
	// private final String SQL_UPDATE_EMPLOYEE = "update emp set ename = ?, job = ?, sal = ?, deptno = ? where empno =
	// ?";
	private final String SQL_GET_ALL = "select * from employee789";
	private final String SQL_INSERT_EMPLOYEE = "insert into employee789(empno, empname, job, salary,department) values(?,?,?,?,?)";

	@Autowired
	public EmployeeDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public boolean createEmployee(Employee789 ee) {
		// TODO Auto-generated method stub
		// return jdbcTemplate.update(SQL_INSERT_USER, ee.getEmpname()) > 0;
		return jdbcTemplate.update(SQL_INSERT_EMPLOYEE, ee.getEmpno(), ee.getEmpname(), ee.getJob(), ee.getSalary(),
				ee.getDepartment()) > 0;
	}

	@Override
	public Employee789 getEmployeeByNo(Integer eno) {
		return jdbcTemplate.queryForObject(SQL_FIND_EMPLOYEE, new Object[] { eno }, new EmployeeMapper());
	}

	@Override
	public List<Employee789> getAllEmployees() {
		System.out.println("Employees List from db through jdbc template Requested");
		return jdbcTemplate.query(SQL_GET_ALL, new EmployeeMapper());
	}

	@Override
	public boolean deleteEmployee(Employee789 ee) {
		return jdbcTemplate.update(SQL_DELETE_EMPLOYEE, ee.getEmpno()) > 0;
	}

	@Override
	public boolean updateEmployee(Employee789 ee) {
		// TODO Auto-generated method stub
		return false;
	}

}
