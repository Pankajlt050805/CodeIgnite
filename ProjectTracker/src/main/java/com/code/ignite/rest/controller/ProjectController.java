package com.code.ignite.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.code.ignite.model.Project;
import com.code.ignite.service.ProjectService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/projects")
@Api(value = "Projects", description = "List of project details", tags = { "Project" })
public class ProjectController {

	@Autowired
	private ProjectService projectService;

	@GetMapping
	public Iterable<Project> findAll() {
		return projectService.findAll();
	}

	@GetMapping("/{id}")
	public Project findOne(@PathVariable Long id) {
		return projectService.findOne(id);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Project create(@RequestBody Project project) {
		return projectService.create(project);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		projectService.delete(id);
	}

	@PutMapping("/{id}")
	public Project updateProject(@RequestBody Project project, @PathVariable Long id) {
		return projectService.updateProject(project, id);
	}
}
