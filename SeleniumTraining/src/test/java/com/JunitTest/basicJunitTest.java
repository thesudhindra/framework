package com.JunitTest;

import static org.junit.Assert.assertTrue;

import org.junit.*;
import org.junit.jupiter.api.Nested;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
@FixMethodOrder(MethodSorters.JVM)
public class basicJunitTest {
	static WebDriver driver;
	
	@BeforeClass
	public static void m1()

	{
		WebDriverManager.chromedriver().setup();
	}
	
	@Before
	public void m2()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void m3()
	{
		driver.get("https://www.google.com");
		assertTrue("Successfully Loaded", driver.getTitle().contains("Google"));
	}
	@After
	public void m4()
	{
		driver.close();
	}
	@AfterClass
	public  static void m5()
	{
		System.out.println("Exit...");
	}

	@Nested
	class innerClass {
		@Test
		public void m5()
		{
			driver.quit();
		}

	}

}
