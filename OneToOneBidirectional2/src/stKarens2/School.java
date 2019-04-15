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
@Table(name = "table_school")
public class School implements Serializable {
	
	@Id
	@GeneratedValue(generator = "gen")
	@GenericGenerator(name = "gen" , strategy = "increment")
	private int id;
	
	@Column(name = "column_address")
	private String address;
	
	@Column(name = "column_area")
	private double area;
	
	@Column(name = "column_rooms")
	private int rooms;
	
	@OneToOne
	Principal principal;

	public School() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public Principal getPrincipal() {
		return principal;
	}

	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}
	
	

	
}
