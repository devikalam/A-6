package STScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Scenario02 {
	@Test
	public void scenario2() {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/");
	}

}
