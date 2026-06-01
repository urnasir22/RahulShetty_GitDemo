import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndNavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/"); //this will wait to load all the element to load
		Thread.sleep(1000);
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice"); //this will load only basics elements
		//also provide back(), forward(), refresh() methods from browser
		Thread.sleep(1000);
		driver.navigate().back(); //browser back button
		Thread.sleep(1000);
		driver.navigate().forward(); //browser forward button
		Thread.sleep(1000);
		driver.navigate().refresh(); //browser refresh button

	}

}
