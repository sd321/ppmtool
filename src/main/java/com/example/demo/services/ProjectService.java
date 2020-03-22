package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Project;
import com.example.demo.repositories.ProjectRepository;



@Service
public class ProjectService {
	
	@Autowired
	ProjectRepository projectRepository;
	
	public Project saveOrUpdateProject(Project project) {
		
		return projectRepository.save(project);
	}
	
}
