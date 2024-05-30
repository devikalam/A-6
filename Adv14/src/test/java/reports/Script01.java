package reports;

import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Script01 {
	@Test
	public void script1() throws Throwable {
		WebDriver driver;
		LocalDateTime dateTime=LocalDateTime.now();
		String date = dateTime.toString().replace(":", "-");
		ScreenshotMethod ss =new ScreenshotMethod();
		ExtentReports reports=new ExtentReports();
		ExtentSparkReporter reporter=new ExtentSparkReporter("./extentreport/"+date+".html");
		reports.attachReporter(reporter);
		ExtentTest test=reports.createTest("books");
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		test.log(Status.INFO,"window is maximized");
		driver.get("https://demowebshop.tricentis.com/");
		test.log(Status.INFO, "demo webshop is launched");
		driver.findElement(By.partialLinkText("Books")).click();
		test.log(Status.INFO, " user clicked on books button");
		driver.findElement(By.xpath("//a[@title=\"Show details for Computing and Internet\"]")).click();
		test.log(Status.INFO, "user clicked on computing and internet");
		driver.findElement(By.id("add-to-cart-button-13")).click();
		test.log(Status.INFO, "product added to cart");
		try {

			if( driver.getTitle().contains("Demo Web Shop. Computing and Internet")) {
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(ss.takeScreenShot(driver)).build());
			}
		} catch (Exception e) {
			// TODO: handle exception
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(ss.takeScreenShot(driver)).build());
		}
		reports.flush();
		
	}

}
