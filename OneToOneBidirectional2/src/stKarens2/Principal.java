package stKarens2;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "principal_table")
public class Principal implements Serializable{
	
	@Id
	@GeneratedValue(generator = "gen")
	@GenericGenerator(name = "gen" , strategy = "increment")
	private int id;
	
	@Column(name = "column_qualificaion")
	private String qualification;
	
	@Column(name = "column_anger")
	private int anger;
	
	@Column(name = "column_patience")
	private int patience;
	
	@OneToOne(mappedBy="principal" , cascade = )
	School school;

	public Principal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getAnger() {
		return anger;
	}

	public void setAnger(int anger) {
		this.anger = anger;
	}

	public int getPatience() {
		return patience;
	}

	public void setPatience(int patience) {
		this.patience = patience;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}
	
	
	

	

}
