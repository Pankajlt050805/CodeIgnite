package com.code.ignite.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import com.code.ignite.model.Project;
import com.code.ignite.service.ProjectService;

@Controller
public class CSVFileDownloadController {

	@Autowired
	private ProjectService projectService;

	@RequestMapping(value = "/downloadReport")
	public void downloadCSV(HttpServletResponse response) throws IOException {

		String csvFileName = "weekly_report.csv";

		response.setContentType("text/csv");

		// creates mock data
		String headerKey = "Content-Disposition";
		String headerValue = String.format("attachment; filename=\"%s\"", csvFileName);
		response.setHeader(headerKey, headerValue);

		// uses the Super CSV API to generate CSV data from the model data
		ICsvBeanWriter csvWriter = new CsvBeanWriter(response.getWriter(), CsvPreference.STANDARD_PREFERENCE);

		String[] header = { "id", "projectName", "clientName", "priority", "startDate", "endDate", "comment" };

		csvWriter.writeHeader(header);

		for (Project project : projectService.findAll()) {
			csvWriter.write(project, header);
		}

		csvWriter.close();
	}
}