package learnIframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeClassroom {

	public static void main(String[] args) {
		
		/**pseudo: 
		 * Step 01: Setup driver for the browser
		 * Step 02: Create a browser instance to launch the browser 
		 * Step 03: Maximize the browser window
		 * Step 04: Navigate to URL"https://www.w3schools.com/js/tryit.asp?filename=tryjs_default"
		 * Step 05: Try to find the "Try It" button present in the page
		 * Step 06: Click the button which is present inside the i-frame
		 * Step 07: Handle the Alert
		 * Step 08: Capture the response after clicking the button
		 * Step 09: Validate the response result 
		 * Step 10: Exit the frame and close the browser instance or session  
		 * 
		 */
		
		//Step 01:
		WebDriverManager.chromedriver().setup();
		//Step 02:
		ChromeDriver driver=new ChromeDriver();
		//Step 03:
		driver.manage().window().maximize();
		//Step 04: Navigate to URL"https://www.w3schools.com/js/tryit.asp?filename=tryjs_default"
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_default");
		//Step 06: Click the button which is present inside the i-frame
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		//getting into the i-frame
		driver.switchTo().frame(iframe);
		//Step 05: Try to find the "Try It" button present in the page
		WebElement tryItBtn = driver.findElement(By.xpath("//button[contains(text(),'Click Me!')]"));
		System.out.println("Button -Try It has been identified successfully");
		tryItBtn.click();
		System.out.println("Button -Try It has been clicked successfully");
		String msg="Click the button to change the layout of this paragraph";
		String outmsg = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		if(outmsg.equals(msg)) {
			System.out.println("Validation passed");
		}
		else {
			System.out.println("Validation failed");
		}
		
		
	}

}
