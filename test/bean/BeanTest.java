package bean;

import org.junit.Test;

public class BeanTest {

	@Test
	public void print() {
		Commodity bag = new Bag(3);
		System.out.println(bag.getPrice());
//		Commodity c = new Commodity(1);
	}
}
