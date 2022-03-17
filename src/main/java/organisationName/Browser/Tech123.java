package organisationName.Browser;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tech123 {
	WebDriver driver;
	@Before
	public void launchbroser() {

		System.setProperty("webdriver.chrome.driver", "/Users/vipulyevle/vipul/Softwares/driver/chromedriver");

		driver = new ChromeDriver();

		driver.get("https://techfios.com/billing/?ng=dashboard/#");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void learnelementlocator() {
		
		//launchbroser();
		System.out.println("jkj");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("username"))));
		driver.findElement(By.name("username")).sendKeys("demo@techfios.com");
		System.out.println("gb");
		driver.findElement(By.name("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Utilities")).click();
		//driver.findElement(By.linkText("New Transfer")).click();
	}
}
