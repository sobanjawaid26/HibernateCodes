package spiders;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "table_vehicle")
public class Vehicle implements Serializable {
	
	@Id
	@GeneratedValue(generator ="inc")
	@GenericGenerator(name = "inc" , strategy = "increment")
	@Column(name = "vehicle_id")

	private int id;
	
	@Column(name = "vehicle_make")
	private String make;
	
	@Column(name = "vehicle_model")
	private String model;
	
	@Column(name = "vehicle_lplate")
	private String lplate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getLplate() {
		return lplate;
	}

	public void setLplate(String lplate) {
		this.lplate = lplate;
	}

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
