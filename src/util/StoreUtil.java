package util;

public class StoreUtil {
	public static <T> T convertObject(Object obj , Class<T> targetClass) {
	    try {
	        return targetClass.cast(obj);
	    } catch(ClassCastException e) {
	        return null;
	    }
	}
}
