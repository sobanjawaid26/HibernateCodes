package org.spiders.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "table_student")
public class StudentDTO implements Serializable{
	
	@Id
	@GeneratedValue(generator = "gen")
	@GenericGenerator(name = "gen" , strategy = "increment")
	private int id;
	
	@Column(name = "column_studentname")
	private String name;
	
	@Column(name = "column_studnetage")
	private int age;
	
	@Column(name = "column_class")
	private String classroom;
	
	@ManyToMany(mappedBy="listOfStudent")
	List<TeacherDTO> listOfTeacher = new ArrayList<TeacherDTO>();

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getClassroom() {
		return classroom;
	}

	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	public List<TeacherDTO> getListOfTeacher() {
		return listOfTeacher;
	}

	public void setListOfTeacher(List<TeacherDTO> listOfTeacher) {
		this.listOfTeacher = listOfTeacher;
	}

	public StudentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
