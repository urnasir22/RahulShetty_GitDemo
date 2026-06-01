import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.findElement(By.id("name")).sendKeys("Nasir");
		Thread.sleep(2000);
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		
		//Handling alert  --  Ok button
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		//Handling alert  --  Cancel button
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();

	}

}

























