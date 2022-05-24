package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		By usernamelocator = RelativeLocator.with(By.xpath("//input[@id='user-name']")).above(By.xpath("//input[@id='password']"));
		driver.findElement(usernamelocator).sendKeys("standard_user");
		
		By passwordlocator = RelativeLocator.with(By.xpath("//input[@id='password']")).below(By.xpath("//input[@id='user-name']"));
		driver.findElement(passwordlocator).sendKeys("secret_sauce");
		
		
		By loginButton = RelativeLocator.with(By.xpath("//input[@id='login-button']")).below(passwordlocator);
		driver.findElement(loginButton).click();
		
		
		
		//driver.close();
		

	}

}
