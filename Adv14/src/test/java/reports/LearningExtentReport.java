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

public class LearningExtentReport {
	@Test
	public void script() throws Throwable {
		WebDriver driver;
		LocalDateTime dateTime=LocalDateTime.now();
		String date = dateTime.toString().replace(":", "-");
		ScreenshotMethod ss =new ScreenshotMethod();
	ExtentReports reports=new ExtentReports();
	ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter("./extentreport/"+date+".html");
		reports.attachReporter(extentSparkReporter);
		ExtentTest test = reports.createTest("login");
		driver=new EdgeDriver();
		test.log(Status.INFO, "browser is launched");
		driver.manage().window().maximize();
		test.log(Status.INFO, "window is maximized");
		driver.get("https://demowebshop.tricentis.com/");
		test.log(Status.INFO, "demo web shop is launched");
		driver.findElement(By.partialLinkText("Log in")).click();
		test.log(Status.INFO, "login page is displayed");
		driver.findElement(By.id("Email")).sendKeys("saride@gmail.com");
		test.log(Status.INFO,"user entered the email");
		driver.findElement(By.name("Password")).sendKeys("Devivarsha@123");
		test.log(Status.INFO, "user entered the password");
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		test.log(Status.INFO, "user has clicked on login button");
		try {
			if(driver.findElement(By.linkText("Log out")).isDisplayed()) {
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(ss.takeScreenShot(driver)).build());	
			}
		} catch (Exception e) {
			// TODO: handle exception
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(ss.takeScreenShot(driver)).build());
		}
		
	reports.flush();
	}

}
