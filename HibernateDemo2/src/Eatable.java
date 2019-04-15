import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class Eatable {
	
	@Column(name = "eatable_name")
	private String name;
	
	@Column(name = "eatable_price")
	private int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Eatable() {
		super();
	}
	
}
