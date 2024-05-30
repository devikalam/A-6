package STScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script01 {
	@Test
	public void script1() throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()=\"Register\"]")).click();
		Reporter.log("user clicked on register button",true);
		driver.findElement(By.id("gender-female")).click();
		Reporter.log("user selected radio button",true);
		driver.findElement(By.id("FirstName")).sendKeys("devi");
		driver.findElement(By.id("LastName")).sendKeys("saride");
		driver.findElement(By.id("Email")).sendKeys("saride@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("devivarsha@1");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("devivarsha@1");
		driver.findElement(By.id("register-button")).click();
		Reporter.log("user clicked on register button",true);
		
		driver.findElement(By.xpath("//a[.=\"Log in\"]")).click();
		Reporter.log("user clicked on login button",true);
		driver.findElement(By.name("Email")).sendKeys("saride@gmail.com");
		Reporter.log("user has entered the email",true);
		driver.findElement(By.id("Password")).sendKeys("devivarsha@1");
		Reporter.log("user has entered the password",true);
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		Reporter.log("user has logined the application",true);
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
		Reporter.log("user clicked on shoes module",true);
		
		driver.findElement(By.linkText("Blue and green Sneaker")).click();
		Reporter.log("user has clicked on one shoe in list of suggestions",true);
		driver.findElement(By.id("add-to-cart-button-28")).click();
		Reporter.log("user added the product in cart",true);
		driver.findElement(By.linkText("Shopping cart")).click();
		Reporter.log("user checked the shooping cart whether the product is added",true);
	}
}
