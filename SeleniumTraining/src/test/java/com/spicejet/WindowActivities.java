package com.spicejet;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowActivities {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		initializeBrowser(driver);
		driver.navigate().back();
		System.out.println("In main method "+ driver.getTitle());
		
		
		
		
		
		
	}
	
	public static void initializeBrowser(ChromeDriver driver)
	{
		driver.manage().window().maximize();
		driver.get("http://3.110.88.201/dropdownsPractise/#");
		System.out.println("In initializeBrowser Method "+driver.getTitle());
	}

}
