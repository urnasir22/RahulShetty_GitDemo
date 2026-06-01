import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Dynamic dropdown
		//click on 'From' dropdown
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//click on city name
		driver.findElement(By.cssSelector("a[value='ATQ']")).click();
		Thread.sleep(2000);
		
		//click on city from 'To' dropdown
		driver.findElement(By.xpath("(//a[contains(text(), 'Dehradun')])[2]")).click();

	}

}


































