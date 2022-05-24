package com.orangeHrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class baseClass {

	public static WebDriver driver;

	public static void getBrowserInstance(String browser) {
		switch (browser) {

			case "edge":
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			break;

			case "chrome":

			default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(setChromeOptions());

		}

	}

	public static ChromeOptions setChromeOptions()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		options.setHeadless(false);
		//options.setAcceptInsecureCerts(true);

		Map<String,Object> map = new HashMap<>();
		map.put("download.default_directory","C:\\Users\\sdeshpande\\Desktop\\Automated Downloads");
		map.put("profile.password_manager_enabled",true);
		map.put("download.prompt_for_donwload",false);
		map.put("safebrowsing.enabled", true);
		map.put("profile.default_content_settings.popups", 0);

		options.setExperimentalOption("prefs",map);
		return options;
	}

}
