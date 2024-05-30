package ItScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Scenario2 {
	@Test
	public void script2() {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()=\"Register\"]")).click();
		Reporter.log("user clicked on register button",true);
		driver.findElement(By.id("gender-female")).click();
		Reporter.log("user selected radio button",true);
		driver.findElement(By.id("FirstName")).sendKeys("devi");
		driver.findElement(By.id("LastName")).sendKeys("kalam");
		driver.findElement(By.id("Email")).sendKeys("saride@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("devivarsha@1");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("devivarsha@1");
		driver.findElement(By.id("register-button")).click();
		Reporter.log("enter username & password & click on login button",true);
		
		driver.findElement(By.xpath("//a[.=\"Log in\"]")).click();
		Reporter.log("user clicked on login button",true);
		driver.findElement(By.name("Email")).sendKeys("devisaride@gmail.com");
		Reporter.log("user has entered the email",true);
		driver.findElement(By.id("Password")).sendKeys("kalam@1234");
		Reporter.log("user has entered the password",true);
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
}
	}


