package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestCase8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hetgi\\OneDrive\\Masaüstü\\Hilmi\\Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");
		
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		String text = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]")).getText();
		
		Assert.assertTrue(text.contains("Welcome, Tester!"), "String doesn't exist.");
		
		WebElement table = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]"));
		int size = table.findElements(By.tagName("tr")).size();
		Assert.assertTrue(size > 5, "Less than or equal to 5 orders.");
		
		WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid_ctl02_OrderSelector\"]"));
		checkbox.click();
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_btnDelete\"]")).click();
		
		
		
		
		
		
		
	}

}
