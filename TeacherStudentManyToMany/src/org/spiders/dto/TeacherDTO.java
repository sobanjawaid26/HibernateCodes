package org.spiders.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "table_teacher")
public class TeacherDTO implements Serializable {

	@Id
	@GeneratedValue(generator = "gen")
	@GenericGenerator(name = "gen", strategy = "increment")
	private int id;

	@Column(name = "column_teachername")
	private String name;

	@Column(name = "column_teacherage")
	private int age;

	@Column(name = "column_teaching")
	private String teaching;
	
	@Column(name = "column_degree")
	private String degree;
	
	@ManyToMany
	List<StudentDTO> listOfStudent = new ArrayList<StudentDTO>();

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

	public String getTeaching() {
		return teaching;
	}

	public void setTeaching(String teaching) {
		this.teaching = teaching;
	}

	public List<StudentDTO> getListOfStudent() {
		return listOfStudent;
	}

	public void setListOfStudent(List<StudentDTO> listOfStudent) {
		this.listOfStudent = listOfStudent;
	}
	
	

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public TeacherDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

}
