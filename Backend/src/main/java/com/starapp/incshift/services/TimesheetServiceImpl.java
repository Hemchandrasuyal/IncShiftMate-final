package com.starapp.incshift.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starapp.incshift.entity.Timesheet;
import com.starapp.incshift.repository.TimesheetRepository;
@Service
public class TimesheetServiceImpl implements TimesheetService {
	@Autowired
	TimesheetRepository timesheetRepository;
	@Override
	public List<Timesheet> approvedRejectedTimesheet(int employeeId,int status) {
	
		return timesheetRepository.findByemployeeIdapproval( employeeId,status);
	}
	@Override
	public List<Timesheet> timesheetOfManager(int employeeId) {
	
		return timesheetRepository.findByemployeeId(employeeId);
	}
	@Override
	public List<Timesheet> timesheetManagerBasedOnProjectId(int employeeId, String projectId) {

		return timesheetRepository.findByemployeeId(employeeId,projectId);
	}
	@Override
	public Timesheet updatestatus(String timesheetId) {
		Timesheet timesheet = timesheetRepository.findBytimesheetId(timesheetId);
		timesheet.setApproval(1);
	
		return timesheetRepository.save(timesheet);
	}

}
