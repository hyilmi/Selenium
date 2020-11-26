package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hetgi\\OneDrive\\Masaüstü\\Hilmi\\Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2ftestcomplete12%2fweborders%2fProcess.aspx\r\n"
						+ "\r\n");
		
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		driver.findElement(By.linkText("Order")).click();
				
		Select selector = new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
		
		selector.selectByVisibleText("FamilyAlbum");
		Thread.sleep(1000L);
		selector.selectByIndex(2);
		Thread.sleep(1000L);
		selector.selectByValue("MyMoney");
		

	}

}
