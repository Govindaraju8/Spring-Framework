package com.doctorapp.spring.jdbc.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class AppointmentSchedularMapper implements RowMapper<AppointmentSchedule>{
	
	@Override
	public AppointmentSchedule mapRow(ResultSet resultSet, int i) throws SQLException {
		AppointmentSchedule appointment = new AppointmentSchedule();
		appointment.setSlotdoctorid(resultSet.getInt("slotdoctorid"));
		appointment.setSlotid(resultSet.getInt("slotid"));
		appointment.setSlotfrom(resultSet.getString("slotfrom"));
		appointment.setSlotto(resultSet.getString("slotto"));
		appointment.setSlotdate(resultSet.getString("slotdate"));
		appointment.setSlotstatus(resultSet.getString("slotstatus"));
		return appointment;
	}

}
