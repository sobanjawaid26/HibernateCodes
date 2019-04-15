package org.karens.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "table_student")
public class StudentDto implements Serializable{
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "table_student_name")
	private String name;
	
	@Column(name = "table_batch")
	private String batch;
	
	@Column(name = "table_subject")
	private String subjects;
	
	@ManyToMany
	List<FacultyDto> listOfFaculty = new ArrayList<FacultyDto>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public String getSubjects() {
		return subjects;
	}

	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}

	
	
	public List<FacultyDto> getListOfFaculty() {
		return listOfFaculty;
	}

	public void setListOfFaculty(List<FacultyDto> listOfFaculty) {
		this.listOfFaculty = listOfFaculty;
	}

	public StudentDto(int id, String name, String batch, String subjects) {
		super();
		this.id = id;
		this.name = name;
		this.batch = batch;
		this.subjects = subjects;
	}

	public StudentDto(int id, String name, String batch, String subjects, List<FacultyDto> listOfFaculty) {
		super();
		this.id = id;
		this.name = name;
		this.batch = batch;
		this.subjects = subjects;
		this.listOfFaculty = listOfFaculty;
	}

	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	
	
	
}
