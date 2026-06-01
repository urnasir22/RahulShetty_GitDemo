import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.partialLinkText("Free Access to")).click();
		
		//Get ids for all the windows
		Set<String> allWindows = driver.getWindowHandles();
		
		//Iterate over all the windows
		Iterator<String> it = allWindows.iterator();
		
		//store first window id(Parent window)
		String parentWindow = it.next();
		
		//store second window id(child window)
		String childWindow = it.next();
		
		//move to the second window(child window)
		driver.switchTo().window(childWindow);
		
		//perform some action on child window
		driver.findElement(By.xpath("(//a[@href='lifetime-access'])[2]")).click();
		
		//move back to the first window(parent window)
		driver.switchTo().window(parentWindow);
		
		//perform some action on the parent window
		driver.findElement(By.id("signInBtn")).click();
		
		//close all windows
		driver.quit();

	}

}
































