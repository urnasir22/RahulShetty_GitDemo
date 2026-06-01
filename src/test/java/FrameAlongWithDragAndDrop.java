import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameAlongWithDragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/droppable/");
		
		//switch to frame
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		
		//WebElement of source -- jise hum drag karenge
		WebElement source = driver.findElement(By.id("draggable"));
		
		//WebElement of target -- jaha hum drop karenge
		WebElement target = driver.findElement(By.id("droppable"));
		
		//For drag and drop we need Actions class because its related to mouse activity
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).build().perform();
		
		//come back from frame to the main html page
		driver.switchTo().defaultContent();

	}

}































