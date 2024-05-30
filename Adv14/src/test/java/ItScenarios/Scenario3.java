package ItScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Scenario3 {
	@Test
	public void script3() throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Books")).click();
		Thread.sleep(2000);
		WebElement viewas = driver.findElement(By.id("products-viewmode"));
		viewas.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		Reporter.log("user checked whether books viewed in list mode");
		
		driver.quit();
	}

}
