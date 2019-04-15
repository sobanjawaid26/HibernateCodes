package org.karens.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "table_principal")
public class PrincipalDto implements Serializable{

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "table_faculty_name")
	private String name;
	
	
	
	List<StudentDto> studentListForPrincipal = new ArrayList<StudentDto>();
	
	List<FacultyDto> facultyListForPrincipal = new ArrayList<FacultyDto>(); 
	
	
	
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

	public List<StudentDto> getStudentListForPrincipal() {
		return studentListForPrincipal;
	}

	public void setStudentListForPrincipal(List<StudentDto> studentListForPrincipal) {
		this.studentListForPrincipal = studentListForPrincipal;
	}

	public List<FacultyDto> getFacultyListForStudent() {
		return facultyListForPrincipal;
	}

	public void setFacultyListForStudent(List<FacultyDto> facultyListForStudent) {
		this.facultyListForPrincipal = facultyListForStudent;
	}

	

	public PrincipalDto(int id, String name, List<StudentDto> studentListForPrincipal,
			List<FacultyDto> facultyListForPrincipal) {
		super();
		this.id = id;
		this.name = name;
		this.studentListForPrincipal = studentListForPrincipal;
		this.facultyListForPrincipal = facultyListForPrincipal;
	}

	public PrincipalDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
