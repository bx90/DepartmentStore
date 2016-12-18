package bean;

public class Bag extends Commodity {
	private String name;
	private String size;
	
	Bag() {}
	public Bag(double price) {
		this.price = price;
	}
	
//	public static void test() {
//		System.out.println("Bag");
//	}
	
//	public void test() {
//		
//	}
//	
	
	@Override
	public double getPrice() {
		return this.price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
}
