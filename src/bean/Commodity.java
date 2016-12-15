package bean;

/**
 * The base class for all commodities.
 * 
 * @author Boxiong
 */

public class Commodity {
	static protected double discount;
	protected double price;
	
	
	static {
		discount = 0.8;
	}
	
	public double discount() {
		return this.price * discount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
