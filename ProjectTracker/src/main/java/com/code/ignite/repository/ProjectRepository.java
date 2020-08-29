package com.code.ignite.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.code.ignite.model.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {

	@Query("SELECT COUNT(p) FROM Project p WHERE p.startDate!=null")
	Long totalWIPProjects();

	@Query("SELECT COUNT(p) FROM Project p")
	Long totalProjects();
}
