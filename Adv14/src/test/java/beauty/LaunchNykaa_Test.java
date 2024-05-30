package beauty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LaunchNykaa_Test {
	@Test
	public void nykaa() throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		Thread.sleep(2000);
		driver.quit();
	}

}
