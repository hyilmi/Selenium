package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase5 {
//autosuggest

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hetgi\\OneDrive\\Masaüstü\\Hilmi\\Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		WebElement autoSuggest = driver.findElement(By.cssSelector("#autocomplete"));
		autoSuggest.sendKeys("tu");
		
		List<WebElement> countries = driver.findElements(By.className("ui-menu-item-wrapper"));
		for (WebElement country : countries) {
			if(country.getText().equalsIgnoreCase("turkey")) {
				country.click();
				break;
			}
			
		}
		
		

	}

}
