package ItScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Scenario1 {
	@Test
	public void script1() throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("demoweb shop is launched");
		driver.findElement(By.id("small-searchterms")).sendKeys("computer",Keys.ENTER);
		Reporter.log("user enter one product in search bar");
		driver.findElement(By.linkText("Build your own computer")).click();
		Reporter.log("user selects one product in list of suggestions");
		driver.findElement(By.name("product_attribute_16_3_6")).click();
		driver.findElement(By.id("add-to-cart-button-16")).click();
		Reporter.log("user clicked on add to cart");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Shopping cart")).click();
		Reporter.log("user clicked on shopping cart to check the product");
		
	}

}
