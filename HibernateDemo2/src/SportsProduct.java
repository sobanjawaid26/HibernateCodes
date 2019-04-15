import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SportsProduct {
	
	@Column(name = "sportsProduct_name")
	private String name;
	
	@Column(name = "sportsProduct_price")
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
	public SportsProduct() {
		super();
	}
	
}
