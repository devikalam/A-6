package beauty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LaunchLoreal_Test {
			@Test
			public void loreal() throws Throwable {
				WebDriver driver=new EdgeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.lorealprofessionnel.in/");
				Thread.sleep(2000);
				driver.quit();
			}

		

}
