import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowHandlingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.linkText("Click Here")).click();

		// Getting all windows ids
		Set<String> allWindows = driver.getWindowHandles();
		// Iterate
		Iterator<String> windows = allWindows.iterator();

		// Get first window id
		String parentWindow = windows.next();

		// Get second window id
		String childWindow = windows.next();

		// move to the child window
		driver.switchTo().window(childWindow);

		System.out.println(driver.findElement(By.cssSelector("div[class='example']")).getText());

		// move to the parent window
		driver.switchTo().window(parentWindow);

		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());

	}

}
