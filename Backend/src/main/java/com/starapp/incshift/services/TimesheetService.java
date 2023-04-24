package com.starapp.incshift.services;

import java.util.List;

import com.starapp.incshift.entity.Timesheet;

public interface TimesheetService {
	public List<Timesheet> approvedRejectedTimesheet(int employeeId,int Status);
    public List<Timesheet> timesheetOfManager(int employeeId);
    public List<Timesheet> timesheetManagerBasedOnProjectId(int employeeId,String projectId);
    public Timesheet updatestatus(String timesheetId);
}
