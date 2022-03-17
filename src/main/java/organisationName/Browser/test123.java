package organisationName.Browser;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test123 {
	
		
		static WebDriver driver;
		
		@AfterClass
		public static  void afterTest() {
			System.out.println("After Class");
		}
		
		@BeforeClass
		public static void beforeTest() {
			System.out.println("Before Class");
		}
		
		@Before
		public  void launchBrowser() {
			System.out.println("Before");
			//System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", "/Users/vipulyevle/vipul/Softwares/driver/chromedriver");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.techfios.com/billing/?ng=login/");
		}
		
     	@Test
		public void loginTest1() {	
			System.out.println("test positive");
			driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
			driver.findElement(By.id("password")).sendKeys("abc123");
			WebElement nameelement = driver.findElement(By.xpath('/input[@id="page-wrapper"]/div[2]/div/h2'));
			driver.findElement(By.name("login")).click();
		}
		
		@Test
		public void loginTest2() {
			System.out.println("test two");
			driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
			driver.findElement(By.id("password")).sendKeys("abc123231");
			driver.findElement(By.name("login1")).click();
		}
		
		@Test
		public void loginTest3() {
			System.out.println("test three");
			driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
			driver.findElement(By.id("password")).sendKeys("abc12323");
			driver.findElement(By.name("login1")).click();
		}
		@Test
		public void loginTest4() {
			System.out.println("test three");
			driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
			driver.findElement(By.id("password")).sendKeys("abc1233");
			driver.findElement(By.name("login1")).click();
		}
		
		
		@After
		public  void tearDown() {
			System.out.println("after");
			driver.close();
		}
		
		

	}

