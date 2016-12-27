package bean;

/**
 * The base class for all commodities.
 * 
 * @author Boxiong
 */

public class Commodity {	
	static protected double discount;
	protected double price;
	
	Commodity () {
		System.out.println("Comm constr");
	}
	Commodity (int a ) {
		System.out.println("Comm constr" + a );
	}
	
	static {
		discount = 0.8;
	}
	
	public static void test() {
		System.out.println("Comm");
	}
	public double discount() {
		return this.price * discount;
	}

	public double getPrice() {
		return price * discount;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
