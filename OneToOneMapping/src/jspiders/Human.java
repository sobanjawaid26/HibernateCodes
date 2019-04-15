package jspiders;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "human_table")
public class Human implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name ="human_id")
	private int id;
	
	@Column(name ="human_fname")
	private String firstName;
	
	@Column(name ="human_lname")
	private String lastName;
	
	@Column(name ="human_age")
	private int age;
	
	@OneToOne
	private Heart heart;
	
	

	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Human [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	
	

}
