package com.code.ignite.dto;

public class HomePageDTO {

	private Long totalUsers;
	private Long totalProjects;
	private Long totalBillableUsers;
	private Long totalWIPProjects;

	public Long getTotalUsers() {
		return totalUsers;
	}

	public void setTotalUsers(Long totalUsers) {
		if (totalUsers == null) {
			this.totalUsers = 0l;
		} else {
			this.totalUsers = totalUsers;
		}

	}

	public Long getTotalProjects() {
		return totalProjects;
	}

	public void setTotalProjects(Long totalProjects) {
		if (totalUsers == null) {
			this.totalProjects = 0l;
		} else {
			this.totalProjects = totalProjects;
		}
	}

	public Long getTotalBillableUsers() {
		return totalBillableUsers;
	}

	public void setTotalBillableUsers(Long totalBillableUsers) {
		if (totalBillableUsers == null) {
			this.totalBillableUsers = 0l;
		} else {
			this.totalBillableUsers = totalBillableUsers;
		}
	}

	public Long getTotalWIPProjects() {
		return totalWIPProjects;
	}

	public void setTotalWIPProjects(Long totalWIPProjects) {
		if (totalWIPProjects == null) {
			this.totalWIPProjects = 0l;
		} else {
			this.totalWIPProjects = totalWIPProjects;
		}
	}

}
