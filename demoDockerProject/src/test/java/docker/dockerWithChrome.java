package docker;


import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class dockerWithChrome {
	public static void main(String[] args) throws MalformedURLException {
		System.setProperty("webdriver.chrome.deriver","D:\\Java - Selenium\\Dependencies\\chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(ChromeOptions.CAPABILITY, option);
		
		URL url = new URL("http://localhost:4444/wd/hub");
		WebDriver driver = new RemoteWebDriver(url,dc);
		
		driver.get("https://www.google.com");
		System.out.println("Title of the page "+driver.getTitle());
		driver.quit();
		
		
		
	}

}
