package test;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestCase9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hetgi\\OneDrive\\Masaüstü\\Hilmi\\Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/div/div/table/thead/tr/th[1]")).click();
		
		List<WebElement> elements = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> ogList = elements.stream().map(str -> str.getText()).collect(Collectors.toList());
		List<String> sortedList = ogList.stream().sorted().collect(Collectors.toList());
		
		Assert.assertEquals(ogList, sortedList);
		
		System.out.println("Sorted!");
		
		List<String> prices = elements.stream().map(s -> getPrice(s)).collect(Collectors.toList());
		
		for (int i = 0; i < sortedList.size(); i++) {
			System.out.printf("%s : $%s", sortedList.get(i), prices.get(i));
			System.out.println();
		}
		
	}
	
	private static String getPrice(WebElement s) {
		WebElement result = s.findElement(By.xpath("following-sibling::td[1]"));
		return result.getText();
	}

}
