package com.code.ignite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.code.ignite.dto.HomePageDTO;
import com.code.ignite.model.Project;
import com.code.ignite.model.User;
import com.code.ignite.service.ProjectService;
import com.code.ignite.service.UserService;

@Controller
public class DashboardController {

	@Value("${spring.application.name}")
	String appName;

	@Autowired
	private UserService userService;

	@Autowired
	private ProjectService projectService;

	@GetMapping("/")
	public String landingPage(Model model) {
		HomePageDTO homePageDTO = new HomePageDTO();
		homePageDTO.setTotalBillableUsers(userService.findTotalUsers());
		homePageDTO.setTotalUsers(userService.findTotalUsers());
		homePageDTO.setTotalProjects(projectService.totalProjects());
		homePageDTO.setTotalWIPProjects(projectService.totalWIPProjects());
		model.addAttribute("users", userService.findAll());
		model.addAttribute("projects", projectService.findAll());
		model.addAttribute("homePageDTO", homePageDTO);
		return "home";
	}

	@GetMapping("/login")
	public String loginPage(Model model) {
		model.addAttribute("appName", appName);
		return "login";
	}

	@GetMapping("/home")
	public String homePage(Model model) {
		HomePageDTO homePageDTO = new HomePageDTO();
		homePageDTO.setTotalBillableUsers(userService.findTotalUsers());
		homePageDTO.setTotalUsers(userService.findTotalUsers());
		homePageDTO.setTotalProjects(projectService.totalProjects());
		homePageDTO.setTotalWIPProjects(projectService.totalWIPProjects());
		model.addAttribute("users", userService.findAll());
		model.addAttribute("projects", projectService.findAll());
		model.addAttribute("homePageDTO", homePageDTO);
		return "home";
	}

	@GetMapping("/addUser")
	public String addUser(Model model) {
		model.addAttribute("user", new User());
		return "addUser";
	}

	@GetMapping("/listUsers")
	public String listUsers(Model model) {
		model.addAttribute("users", userService.findAll());
		return "listUsers";
	}

	@PostMapping("/addUser")
	public String addUser(User user) {
		userService.create(user);
		return "listUsers";
	}

	@GetMapping("/addProject")
	public String addproject(Model model) {
		model.addAttribute("project", new Project());
		return "addProject";
	}
	
	@PostMapping("/addProject")
	public String addProject(Project project) {
		projectService.create(project);
		return "listProjects";
	}

	@GetMapping("/listProjects")
	public String listProjects(Model model) {
		model.addAttribute("projects", projectService.findAll());
		return "listProjects";
	}
}
