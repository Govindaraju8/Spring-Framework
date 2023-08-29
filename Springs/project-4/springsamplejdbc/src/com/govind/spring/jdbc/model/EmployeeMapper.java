package com.govind.spring.jdbc.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee789> {

	@Override
	public Employee789 mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee789 emp = new Employee789();
		emp.setEmpno(rs.getInt("empno"));
		emp.setEmpname(rs.getString("empname"));
		emp.setJob(rs.getString("job"));
		emp.setSalary(rs.getDouble("salary"));
		emp.setDepartment(rs.getString("department"));
		return emp;
	}

}
