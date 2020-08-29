package com.code.ignite.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.ignite.exception.ProjectNotFoundException;
import com.code.ignite.model.Project;
import com.code.ignite.repository.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;

	public Iterable<Project> findAll() {
		return projectRepository.findAll();
	}

	public Long totalProjects() {
		return projectRepository.totalProjects();
	}

	public Long totalWIPProjects() {
		return projectRepository.totalWIPProjects();
	}

	public Project findOne(Long id) {
		return projectRepository.findById(id).orElseThrow(ProjectNotFoundException::new);
	}

	public Project create(Project project) {
		return projectRepository.save(project);
	}

	public void delete(Long id) {
		projectRepository.findById(id).orElseThrow(ProjectNotFoundException::new);
		projectRepository.deleteById(id);
	}

	public Project updateProject(Project project, Long id) {
		if (project.getId() != id) {
			throw new ProjectNotFoundException();
		}
		return projectRepository.findById(id).orElseThrow(ProjectNotFoundException::new);
	}
}
