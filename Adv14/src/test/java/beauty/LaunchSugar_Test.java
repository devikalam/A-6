package beauty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LaunchSugar_Test {

	@Test
	public void sugar() throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.sugarcosmetics.com/");
		Thread.sleep(2000);
		driver.quit();
	}

}


