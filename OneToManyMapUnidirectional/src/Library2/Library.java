package Library2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "table_library")
public class Library implements Serializable{
	
	@Id
	@GeneratedValue(generator = "gen")
	@GenericGenerator(name = "gen" , strategy = "increment")
	private int id;
	
	@Column(name = "column_libname")
	private String libName;
	
	@Column(name = "column_location")
	private String location;
	
	@Column(name = "column_area")
	private int area;
	
	@OneToMany
	List<Books> listOfBooks = new ArrayList<Books>();
	
	public List<Books> getListOfBooks() {
		return listOfBooks;
	}

	public void setListOfBooks(List<Books> listOfBooks) {
		this.listOfBooks = listOfBooks;
	}

	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibName() {
		return libName;
	}

	public void setLibName(String libName) {
		this.libName = libName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	
	
	
	

	

}
