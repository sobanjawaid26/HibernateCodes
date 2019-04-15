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
@Table(name = "table_faculty")
public class FacultyDto implements Serializable{

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "table_faculty_name")
	private String name;
	
	@Column(name = "table_degree")
	private String degree;
	
	@Column(name = "table_teaching")
	private String teaching;
	
	@ManyToMany
	List<StudentDto> listOfStudent = new ArrayList<StudentDto>();

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

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getTeaching() {
		return teaching;
	}

	public void setTeaching(String teaching) {
		this.teaching = teaching;
	}

	public FacultyDto() {
		super();
	}

	public List<StudentDto> getListOfStudent() {
		return listOfStudent;
	}

	public void setListOfStudent(List<StudentDto> listOfStudent) {
		this.listOfStudent = listOfStudent;
	}

	public FacultyDto(int id, String name, String degree, String teaching) {
		super();
		this.id = id;
		this.name = name;
		this.degree = degree;
		this.teaching = teaching;
	}

	public FacultyDto(int id, String name, String degree, String teaching, List<StudentDto> listOfStudent) {
		super();
		this.id = id;
		this.name = name;
		this.degree = degree;
		this.teaching = teaching;
		this.listOfStudent = listOfStudent;
	}
	
	

}
