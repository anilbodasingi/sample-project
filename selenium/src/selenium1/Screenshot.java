package selenium1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws Exception {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	for(int i=1 ; i<=5;i++) {
	 File source=ts.getScreenshotAs(OutputType.FILE);
	 File destination=new File("D:\\screenshot//image"+i+".jpeg");
	 FileHandler.copy(source, destination);
	}
	

	}

}
