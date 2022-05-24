package com.OrangeHrm;

import com.orangeHrm.PropertyHandling;
import com.orangeHrm.baseClass;
import org.openqa.selenium.By;

public class LoginOrangeHrm extends baseClass {
	public static void main(String[] args) throws Exception {

		// System.setProperty("webdriver.chrome.driver", "");

		// WebDriver driver = WebDriverManager.chromedriver().create();

		// Navigate Methods
		// driver.navigate().to("https://www.google.com");
		// driver.navigate().refresh();
		// driver.navigate().back();
		// driver.navigate().forward();
		PropertyHandling propertyHandling = new PropertyHandling();
		String Key = propertyHandling.getProperty("browser");


		getBrowserInstance(propertyHandling.getProperty("browser"));
		//getBrowserInstance(System.getProperty("browser"));
		System.out.println(Key);
		driver.get(propertyHandling.getProperty("OrangeHrmURL"));
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(propertyHandling.getProperty("OrangeHrmUsername"));
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys(propertyHandling.getProperty("OrangeHrmPassword"));
		driver.findElement(By.id("btnLogin")).click();

		String userName = driver.findElement(By.cssSelector("a#welcome")).getText();
		String dashboardStr = driver.findElement(By.xpath("//div[@class='head']//child::h1")).getText();
		System.out.println(userName);
		System.out.println(dashboardStr);

		if (userName.contains("Welcome") || dashboardStr.equals("Dashboard")) {
			System.out.println("Successfully able to login to " + driver.getTitle() + " With user " + userName
					+ " Welcome to " + dashboardStr);
			driver.findElement(By.cssSelector("a[id='menu_leave_viewLeaveModule'] b")).click();
			String urlName = driver.getCurrentUrl();
			System.out.println("Current URL of the page is:  " + urlName);
		} else {
			throw new Exception("Invalid user, Please try again");
		}

		driver.quit();

	}

}
