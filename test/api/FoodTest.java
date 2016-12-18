package api;

import org.junit.Test;

import static api.Food.Desert;
import static api.Food.Drinks;

public class FoodTest {
	@Test
	public void test() {
		Food food = Drinks.Beer;
		food = Desert.Donut;
	}
}
