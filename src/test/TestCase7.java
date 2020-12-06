package test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hetgi\\OneDrive\\Masaüstü\\Hilmi\\Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Multiple Windows")).click();
		
		driver.findElement(By.cssSelector("a[href*='windows']")).sendKeys(Keys.CONTROL, Keys.ENTER);
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		String firstWindow = it.next();
		driver.switchTo().window(it.next());
	
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		
		driver.switchTo().window(firstWindow);
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		

	}

}
