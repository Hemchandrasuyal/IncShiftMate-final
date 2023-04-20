package com.starapp.incshift.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.starapp.incshift.dto.EmployeeRequest;
import com.starapp.incshift.entity.Project;
import com.starapp.incshift.repository.ProjectRepository;
import com.starapp.incshift.services.ProjectService;

@RestController
public class ProjectController {
@Autowired
ProjectService projectService;

//list of project to manager
@CrossOrigin("*")	
@PostMapping("/java/Manager/Project")
public ResponseEntity<List<Project>> managerProject(@RequestBody EmployeeRequest employeeRequest ){
	
	return ResponseEntity.ok(projectService.showProjectManager(employeeRequest.getEmployeeId()));
}	
}
