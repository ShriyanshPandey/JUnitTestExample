package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddStrings {
	
	@Test
	public void test() {
		JUnitFunctions junit = new JUnitFunctions();
		String result = junit.AddString("Hello", "World");
		assertEquals("HelloWorld", result);
	}

}
