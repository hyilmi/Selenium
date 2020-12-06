package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hetgi\\OneDrive\\Masaüstü\\Hilmi\\Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		WebElement option1 = driver.findElement(By.cssSelector("#checkBoxOption1"));
		WebElement option3 = driver.findElement(By.cssSelector("#checkBoxOption3"));
		
		if(!option1.isSelected()) {
			option1.click();
		}
		
		if(!option3.isSelected()) {
			option3.click();
		}
					
		
	}

}
