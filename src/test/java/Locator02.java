import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		
		//Parent to child and then sibling to sibling using xPath
		String loginBtn = driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText();
		System.out.println(loginBtn);
		
		//child to parent traverse using xPath(reverse traversing) - reverse traversing is not possible using cssSelector
		String practiceBtn = driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[1]")).getText();
		System.out.println(practiceBtn);
		driver.close();

	}

}































