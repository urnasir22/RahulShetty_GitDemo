import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		//switch to left frame
		driver.switchTo().frame("frame-top"); //Parent frame -- Top frame
		driver.switchTo().frame("frame-left"); //Child frame -- left frame
		System.out.println(driver.findElement(By.tagName("body")).getText());
		
		//come back to default frame
		driver.switchTo().defaultContent();
		
		//switch to bottom frame
		driver.switchTo().frame("frame-bottom");
		System.out.println(driver.findElement(By.tagName("body")).getText());
	}

}
































