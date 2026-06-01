import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountAvailableLinksInAPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//count of links in entire page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//count of links in footer section -- Ye maine khud se likha hai
		System.out.println(driver.findElements(By.cssSelector("div[id=\"gf-BIG\"] li a")).size());
		
		//Another way to count of links in footer section
		//by limiting the scope of driver
		//Ye maine Rahul shetty's video se sikha hai
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		

	}

}



































