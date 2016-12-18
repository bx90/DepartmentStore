/**
 * 
 */
package api;

/**
 * @author Boxiong
 *
 */
public interface CalculatePrice {
	public <Commodity> int priceOfYuan(Commodity g);
	
	default public String identifyMyself() {
        return "I am an animal.";
    }
}
