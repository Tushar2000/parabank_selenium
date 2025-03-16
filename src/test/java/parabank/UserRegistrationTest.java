package parabank;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UserRegistrationTest extends BaseTest{

	@Test
	public void userregistration() {
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("customer.firstName")).sendKeys("john");
		driver.findElement(By.id("customer.lastName")).sendKeys("Doe");
		driver.findElement(By.id("customer.address.street")).sendKeys("123 john street");
		driver.findElement(By.id("customer.address.city")).sendKeys("gotham");
		driver.findElement(By.id("customer.address.state")).sendKeys("NY");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("12345");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("1234567890");
		driver.findElement(By.id("customer.ssn")).sendKeys("12");
		driver.findElement(By.id("customer.username")).sendKeys("johndoe");
		driver.findElement(By.id("customer.password")).sendKeys("password");
		driver.findElement(By.id("repeatedPassword")).sendKeys("password");
		driver.findElement(By.xpath("//input[@value='Register']")).click();
	}

}
