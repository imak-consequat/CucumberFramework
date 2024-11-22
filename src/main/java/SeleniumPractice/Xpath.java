package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//html/body/div[2]/div/div/div/a")).click(); //Relative x-path
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'companyName')]")).sendKeys("TechM");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Kunal");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Bhatiya");
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();		
		

	}

}
