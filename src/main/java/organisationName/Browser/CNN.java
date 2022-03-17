package organisationName.Browser;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CNN {
	WebDriver driver;
	
	@Test
	public  void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/vipulyevle/vipul/Softwares/driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cnn.com/");

}
	//@Test
	public void Menu() {
		System.out.println("anio");
		
		driver.findElement(By.xpath("//article[@class='sc-bwzfXH sc-eXEjpC kLNoGy']/descendant::h2")).click();
	}
}