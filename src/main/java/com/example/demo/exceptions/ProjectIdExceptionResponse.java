package com.example.demo.exceptions;

public class ProjectIdExceptionResponse {
	
	private String projectIdentifier;
	
	public ProjectIdExceptionResponse(String pId) {
		this.setProjectIdentifier(pId);
	}

	public String getProjectIdentifier() {
		return projectIdentifier;
	}

	public void setProjectIdentifier(String projectIdentifier) {
		this.projectIdentifier = projectIdentifier;
	}
	
	
}
