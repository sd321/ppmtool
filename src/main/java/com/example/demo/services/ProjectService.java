package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Project;
import com.example.demo.exceptions.ProjectIdException;
import com.example.demo.repositories.ProjectRepository;



@Service
public class ProjectService {
	
	@Autowired
	ProjectRepository projectRepository;
	
	public Project saveOrUpdateProject(Project project) {
		
		try {
			project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
			return projectRepository.save(project);
		}
		catch(Exception e) {
			throw new ProjectIdException("Project Id "+project.getProjectIdentifier()+" already exists");
		}
		
		
	}
	
	public Project findProjectByIdentifier(String projectId) {
		
		Project project=projectRepository.findByProjectIdentifier(projectId);
		
		if(project==null) {
			throw new ProjectIdException("Project Id "+projectId+" already exists");
		}
		
		return project;
		
	}
	
}
