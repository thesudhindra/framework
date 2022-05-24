package smokeScripts;

import org.junit.Test;

import org.junit.Assert;


public class validationsTest {

	@Test
	public void validate() {
		
		String expectedStr = "Test";
		String actualStr = "Test";
		
		Assert.assertEquals(expectedStr, actualStr);
		Assert.assertTrue("Invalid Input", 14>12);
		System.out.println("validation test successful");
	}

}
