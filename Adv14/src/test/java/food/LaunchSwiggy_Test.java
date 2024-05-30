package food;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LaunchSwiggy_Test {
	@Test
	
		public void swiggy() throws Throwable {
			WebDriver driver=new EdgeDriver();
			//driver.get("https://www.swiggy.com/");
			String url = System.getProperty("url");
			driver.get(url);
			Thread.sleep(1000);
			driver.quit();
		
		}

	}

