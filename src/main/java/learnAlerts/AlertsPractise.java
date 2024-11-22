package learnAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsPractise {
public static void main(String[] args) throws InterruptedException {
	

	WebDriverManager.chromedriver().setup();
	
	  ChromeDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.leafground.com/alert.xhtml");
	  
	  //check 01: simple alert
	  driver.findElement(By.id("j_idt88:j_idt91")).click();
	  
	  Alert simpleDialog = driver.switchTo().alert();
	  
	  simpleDialog.accept();
	  String msg = driver.findElement(By.id("simple_result")).getText();
	  System.out.println("Simple Dialogue Result Message: "+msg);
	  
	//check 02: Confirmation alert
	  WebElement confirmAlert = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']"));
	  confirmAlert.click();
	  // Clicking on OK Button
	  simpleDialog.accept();
	  String msgOk = driver.findElement(By.xpath("//span[@id='result']")).getText();
	  System.out.println("Alert confirm dialog mesg for ok :" +msgOk);
	// Clicking on Cancel Button
	  confirmAlert.click();
	  simpleDialog.dismiss();
	  String msgCancel = driver.findElement(By.xpath("//span[@id='result']")).getText();
	  System.out.println("Alert confirm dialog mesg for ok :" +msgCancel);
	  
	  //prompt alert
	  
	  WebElement promptAlert = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt104']"));
	  promptAlert.click();
	  
	  System.out.println("prompt alert clicked");
	  simpleDialog.sendKeys("Ashok");
	  Thread.sleep(3000);
	  simpleDialog.accept();
	  String promptOk = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
	  System.out.println("Prompt alert ok mesage:"+promptOk);
	  
	  promptAlert.click();
	  simpleDialog.dismiss();
	  String promptCancel = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
	  System.out.println("Prompt alert ok mesage:"+promptCancel);
	  
	  // Type: 2 Non-Modal dialog box:
	  
	  driver.findElement(By.xpath("//button[@id='j_idt88:j_idt95']")).click();
	  String SweetAlertMsg = driver.findElement(By.xpath("//div[@id='j_idt88:j_idt96_content']")).getText();
	  System.out.println("Sweet Alert message:"+SweetAlertMsg);
	  driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']")).click();
}

	}

