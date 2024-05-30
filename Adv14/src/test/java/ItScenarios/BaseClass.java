package ItScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

//import genericLibrary.UtilityMethod;

public class BaseClass {
		public static WebDriver driver;
		//UtilityMethod um=new UtilityMethod();

		@BeforeSuite
		public void connDB() {
		Reporter.log("application is connected to the database",true);
		}
		@BeforeTest
		public void precond() {
			Reporter.log("precondition for the application",true);
		}
		@BeforeClass
		public void launch() throws Throwable {
			Reporter.log("aplication is launched",true);
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			Reporter.log("window is maximized",true);
			//driver.get(um.getDataFromProPertyFile("url"));
			driver.get("https://demowebshop.tricentis.com/");
			//driver.get(um.getDataFromExcelFile("Sheet1", 1, 3));
			Reporter.log("demowebshop is launched",true);
			
		}
		
			@BeforeMethod
			public void login() {
				/*driver.findElement(By.xpath("//a[text()=\"Register\"]")).click();
				Reporter.log("user clicked on register button",true);
				driver.findElement(By.id("gender-female")).click();
				Reporter.log("user selected radio button",true);
				driver.findElement(By.id("FirstName")).sendKeys("devi");
				driver.findElement(By.id("LastName")).sendKeys("kalam");
				driver.findElement(By.id("Email")).sendKeys("saride@gmail.com");
				driver.findElement(By.name("Password")).sendKeys("devivarsha@1");
				driver.findElement(By.name("ConfirmPassword")).sendKeys("devivarsha@1");
				driver.findElement(By.id("register-button")).click();
				Reporter.log("enter username & password & click on login button",true);*/
				
				driver.findElement(By.xpath("//a[.=\"Log in\"]")).click();
				Reporter.log("user clicked on login button",true);
				driver.findElement(By.name("Email")).sendKeys("devisaride@gmail.com");
				Reporter.log("user has entered the email",true);
				driver.findElement(By.id("Password")).sendKeys("kalam@1234");
				Reporter.log("user has entered the password",true);
				driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		}
			@AfterMethod
			public void logout() {
				Reporter.log("user clicked on logout button",true);
				driver.findElement(By.xpath("//a[.=\"Log out\"]")).click();
				Reporter.log("user has logout the application",true);
			}
			@AfterClass
			public void close(){
				driver.quit();
				Reporter.log("browser closed",true);
			}
			@AfterTest
			public void postcond() {
				Reporter.log("post condition for the application",true);
			}
			@AfterSuite
			public void  closedb() {
				Reporter.log("application is disconnected to the database",true);
			}
		

	}



