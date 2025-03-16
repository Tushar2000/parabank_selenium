package parabank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class UserCreateAccountTest extends BaseTest{
	
	boolean demo = false;

	@Test
	public void createNewAccount() {
		driver.findElement(By.name("username")).sendKeys("johndoe");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		driver.findElement(By.linkText("Open New Account")).click();
		WebElement accounttype = driver.findElement(By.xpath("//select[@id='type']"));
		Select select = new Select(accounttype);
		select.selectByIndex(1);
		//driver.findElement(By.id("fromAccountId")).sendKeys("existing_account_id");
		//driver.findElement(By.className("button")).click();
		WebElement accountid = driver.findElement(By.xpath("//select[@id='fromAccountId']"));
		Select select2 = new Select(accountid);
		select.selectByIndex(1);
		String confirmationText = driver.findElement(By.id("newAccountId")).getText();
		if(confirmationText.contains("Congratulations, your account is now open")) {
			System.out.println("Account creation successful.");
		}
		else {
			System.out.println("Account creation failed.");
		}
	}
	
	@Test
	public void printfunction() {
		System.out.println("Print function output");
		if(demo==true) {
			System.out.println("skip if");
		}
		else {
			System.out.println("skip else");
			throw new SkipException("skipping");
		}
		//throw new SkipException("skip this function");
	}
}
