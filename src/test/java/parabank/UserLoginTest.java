package parabank;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UserLoginTest extends BaseTest{

	@Test(dataProvider="datafunction2",dataProviderClass=dataclass.class)
	public void userLogin(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}
}