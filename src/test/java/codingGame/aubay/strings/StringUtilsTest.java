package codingGame.aubay.strings;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void testConcat() {
		String[] a = { "f", "o", "o", "bar" };
		
		String result = StringUtils.concat(a);
		
		assertEquals("foobar", result);
	}

}
