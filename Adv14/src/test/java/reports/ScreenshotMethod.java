package reports;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotMethod {
	public String takeScreenShot(WebDriver driver) throws Throwable {
		LocalDateTime dateTime=LocalDateTime.now();
		String date = dateTime.toString().replace(":","-");
		String screenshotpath="./screenshot/"+date+".png";
		TakesScreenshot ts = (TakesScreenshot)driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(screenshotpath);
		try {
			FileHandler.copy(scr, target);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "."+screenshotpath;
		
		
		
		
		
	}

}
