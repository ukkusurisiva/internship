package com.example.quizonline_web.model;

import java.util.Optional;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.AssertFalse.List;

@Document(collection ="Question")
public class question {

	@Id
	private String id;
	private String branch;
	private String semester;
	private String subjects;
	private Optional<List> options;
	private String correctoption;
	private String teacherid;
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getSubjects() {
		return subjects;
	}
	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}
	public Optional<List> getOptions() {
		return options;
	}
	public void setOptions(Optional<List> options) {
		this.options = options;
	}
	public String getCorrectoption() {
		return correctoption;
	}
	public void setCorrectoption(String correctoption) {
		this.correctoption = correctoption;
	}
	public String getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(String teacherid) {
		this.teacherid = teacherid;
	}
}
