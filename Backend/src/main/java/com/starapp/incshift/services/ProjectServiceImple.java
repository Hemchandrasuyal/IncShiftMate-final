package com.starapp.incshift.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.starapp.incshift.entity.Project;
import com.starapp.incshift.repository.ProjectRepository;

public class ProjectServiceImple implements ProjectService {
	@Autowired
	ProjectRepository projectrepository;

	@Override
	public List<Project> showProjectManager(int Employeeid) {
		// TODO Auto-generated method stub
		return projectrepository.findByemployeeId(Employeeid);
	}
	
}
