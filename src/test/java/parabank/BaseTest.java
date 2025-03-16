package parabank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
		protected WebDriver driver;
		
		@BeforeClass
		public void setUp() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://parabank.parasoft.com/parabank/index.htm");
		}
		
		@AfterClass
		public void teardown() {
			if(driver != null) {
				driver.quit();
			}
		}
}
