package food;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LaunchingEatSure_Test {
	@Test
	public void eatsure() throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.eatsure.com/");
		Thread.sleep(1000);
		driver.quit();
	
	}

}


