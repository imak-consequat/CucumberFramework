package learnWindowHandles;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		
		/**pseudo code
		 * Step 01: Setup the driver for the specific browser
		 * Step 02: Create instance for the browser 
		 * step 03: Create an Chrome options instance for disabling the notifications
		 * Step 04: Pass the options within the driver to make it disable the notify
		 * Step 05: navigate to IRCTC web page ("https://www.irctc.co.in/")
		 * Step 06: Click on OK button in the dialog
		 * Step 07: Click on the Flight link
		 * Step 08: Go to Flights tab
		 * Step 09: Print the customer care email id
		 * Step 09: Close the first tab(train ticket booking)alone. 
		 * 
		 */
WebDriverManager.chromedriver().setup();
ChromeOptions options=new ChromeOptions();
options.addArguments("--disable-notifications");
ChromeDriver driver = new ChromeDriver(options);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
driver.get("https://www.irctc.co.in/");
driver.findElement(By.xpath("//a[contains(text(),' FLIGHTS ')]")).click();
Set<String> windowHandles = driver.getWindowHandles();
System.out.println(windowHandles.size());
ArrayList<String> arrayList = new ArrayList<String>(windowHandles);
for (String eachHandlestring : arrayList) {
	System.out.println(eachHandlestring);
	}
String MainWindow = arrayList.get(0);
String NewWindow = arrayList.get(1);
System.out.println("MainWindow :"+MainWindow);
System.out.println("NewWindow :"+NewWindow);
driver.switchTo().window(NewWindow);
System.out.println("pointed to the new window");
Thread.sleep(15000);


//driver.findElement(By.xpath("//button[@id='iz-optin-wp-btn1Txt']")).click();
//System.out.println("identified later button and clicked");
WebElement ContactUs = driver.findElement(By.xpath("//li[@class='nav-item dropdown show']"));
ContactUs.click();
System.out.println("identified dropdown");
//driver.findElement(By.xpath("//a[@id='dropdown10']")).click();
//List<WebElement> contactusOptions = driver.findElements(By.xpath("//li[@class='nav-item dropdown'][2]//a[@class='dropdown-item']"));
List<WebElement> contactusOptions =driver.findElements(By.xpath("//div[@class='dropdown-menu show']/a"));

System.out.println(contactusOptions.size());
for (WebElement ddOptions : contactusOptions) {
	System.out.println(ddOptions);
}

//Select dd_Value = new Select(contactus);
//System.out.println(contactus);

	}

}
