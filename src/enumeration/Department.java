package enumeration;

/**
 * The Enum class cannot be inherited, except for that 
 * it can be treated as a normal class.
 * 
 * @author Boxiong
 */
public enum Department {
	FOOD("Hungry?"),
	LIQUOR("How old are you?"),
	FASHION("You can never have too many fashions!"),
	ELECTORIC("How much money do you have?");
	
	private String description;
	//Private constructor.
	private Department(String des) {
		this.description = des;
	}
	public String getDescription() {
		return this.description;
	}
	
	
	@Override
	public String toString() {
		return this.name() + ": "+ this.getDescription();
	}
	
	// Enum can even have a Main function.
	public static void main(String[] args) {
		for (Department d : Department.values()) {
//			System.out.println(d.name() + ": "+d.getDescription());
			System.out.println(d);
		}
	}
}

