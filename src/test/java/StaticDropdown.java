
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Static drop down
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown = new Select(staticDropdown);
		
		//dropdown by selectByIndex
		dropdown.selectByIndex(3);
		
		//Print whether 3rd index is selected or not
		String selectedOptionText = dropdown.getFirstSelectedOption().getText();
		System.out.println(selectedOptionText);
		Thread.sleep(1000);
		
		//dropdown by selectByVisibleText
		dropdown.selectByVisibleText("INR");
		
		//Print whether INR is selected or not
		String selectedOptionByVisibleText = dropdown.getFirstSelectedOption().getText();
		System.out.println(selectedOptionByVisibleText);
		Thread.sleep(1000);
		
		//dropdown by VisibleByValue
		dropdown.selectByValue("AED");
		
		//Print whether AED is selected or not
		String selectedOptionByValue = dropdown.getFirstSelectedOption().getText();
		System.out.println(selectedOptionByValue);
		Thread.sleep(1000);
		
		driver.close();
		

	}

}


































