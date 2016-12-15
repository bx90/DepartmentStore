package util;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class StoreUtilTest {
	String objectConvert;
	@Before
	public void init() {
		objectConvert = "test";
	}
	@Test
	public void convertObjectTest() {
        assertThat(StoreUtil.convertObject(objectConvert, String.class), is("test"));
	}

}
