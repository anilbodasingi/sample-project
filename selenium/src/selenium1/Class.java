package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// WebDriver driver=new ChromeDeiver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/account/login?ret=/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='IiD88i _351hSN']/input")).sendKeys("9010315641");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
		driver.findElement(By.xpath("//button[text()='Verify']")).click();
		driver.findElement(By.id("AHtzWHJqaIwQruU")).click();

	}
}
