import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LocatorPractice {
	
	public static void main(String[] arg) throws InterruptedException {
		
		//Available locators in Selenium
		//1. Id
		//2. xPath
		//3. cssSelector
		//4. name
		//5. class name
		//6. tag name
		//7. link text
		//8. partial link text
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		
		//using id
		driver.findElement(By.id("inputUsername")).sendKeys("Nasir");
		System.out.println("Find username web element and send data Nasir");
		
		//using name
		driver.findElement(By.name("inputPassword")).sendKeys("test123");
		
		//using className
		driver.findElement(By.className("signInBtn")).click();
		
		//cssSelector using tagName.className
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		//using linkText
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//using xPath
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Jhone");
		
		//using cssSelector
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("test@test.com");
		
		//xPath using index
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		
		//cssSelector using index
		driver.findElement(By.cssSelector("input[type='text']:nth- (3)")).sendKeys("test123@test.com");
		
		//xPath traverse using parent child relationship
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("76786786486");
		
		//Explicitly wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		
		//cssSelector using tagName.className
		By resetBtn = By.cssSelector("button.reset-pwd-btn");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(resetBtn)).click();
		
		//cssSelector traverse using parent child relationship
		System.out.println(driver.findElement(By.cssSelector("form p")).getText()); //form is parent and p is child
		
		//xPath using parent to child traverse
		driver.findElement(By.xpath("(//div/button)[1]")).click();
		
		//Explicitly wait
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input#inputUsername")));
		//cssSelector using tagname#id
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Nasir");
		
		//Explicitly wait
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input[type *= 'pass']")));
		//Dynamic cssSelector - Regular expression 
		driver.findElement(By.cssSelector("input[type *= 'pass']")).sendKeys("rahulshettyacademy"); //This is for partial word matching
		
		//Dynamic xPath using contains- Regular expression 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'subm')]"))); //This is for partial word matching
		
		//JavaScript
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//button[contains(@class,'subm')]")));
		
		Thread.sleep(2000);
		//Locator using tagname
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		
		//Locator using available text
		//text is applicable only to xPath and not cssSelector
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		System.out.println("Logged out successfully");
		driver.close();
		
	}

}


































