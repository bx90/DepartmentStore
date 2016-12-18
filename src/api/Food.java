package api;

// Using interface to categorize enums.

public interface Food {

	enum MainCourse implements Food {
		PAD_THAI,
		BURRITO
	}
	
	enum Desert implements Food {
		Icecream,
		Donut
	}
	
	enum Drinks implements Food {
		Beer,
		Wine
	}
}
