package bean;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Test;

public class BeanTest {

	@Test
	public void print() {
		Commodity bag = new Bag(3);
		System.out.println(bag.getPrice());
		try {
		    Handler handler = new FileHandler("/Boxiong/OutFile.log");
		    Logger.getLogger("").addHandler(handler);
		    
		} catch (IOException e) {
		    Logger logger = Logger.getLogger("package.name"); 
		    StackTraceElement elements[] = e.getStackTrace();
		    for (int i = 0, n = elements.length; i < n; i++) {
		        logger.log(Level.CONFIG, elements[i].getMethodName());
		        System.out.println(elements[i].getMethodName() + elements[i].getLineNumber());
		    }
		}
//		Commodity c = new Commodity(1);
	}
}
