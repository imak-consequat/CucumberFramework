package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AccessingDropDownList {
	
public static void main(String[] args) {
	// setup webdriver
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	try{
		// step 01: got to ajio website
	
	driver.get("https://www.ajio.com");
	// maximize browser window
	driver.manage().window().maximize();
	// step 02: locating the search box using xpath and passing the value and enter
	WebElement SearchBox = driver.findElement(By.xpath("//input[@name='searchVal']"));
	SearchBox.click();
	SearchBox.sendKeys("bags");
	SearchBox.submit();
	Thread.sleep(8000);
	// Step 03: find all the results and store it in list
	
	List<WebElement> bags = driver.findElements(By.className("brand"));
	int totalBagsFound = bags.size();
	System.out.println("Total no of bags found : "+totalBagsFound);
	for (WebElement product : bags) {
		
	String bagName = product.findElement(By.xpath("//div[@class='item rilrtl-products-list__item item']/div/a/div/div[2]/div[@class='brand']")).getText();
	String bagPrice = product.findElement(By.xpath("//div[@class='item rilrtl-products-list__item item']/div/a/div/div[2]/div[4]/span[@class='price  ']  ")).getText();
	System.out.println("BagName :"+bagName);
	System.out.println("Bag Price : "+bagPrice);
	}
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		driver.quit();
	}
	
}

}
