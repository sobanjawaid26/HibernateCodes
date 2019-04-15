import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Shop implements Serializable{
	
	@Id
	int id;
	
	String name;
	
	@Embedded
	Eatable eatable;
	
	@Embedded
	SportsProduct sportsproducts;
	
	
	
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
	public Eatable getEatable() {
		return eatable;
	}
	public void setEatable(Eatable eatable) {
		this.eatable = eatable;
	}
	
	public SportsProduct getSportsproducts() {
		return sportsproducts;
	}
	public void setSportsproducts(SportsProduct sportsproducts) {
		this.sportsproducts = sportsproducts;
	}
	public Shop() {
		super();
	}
	
	
}
