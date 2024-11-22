package learnIframe;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnIframe {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/frame.xhtml");
		String f1msg="Hurray! You Clicked Me.";
		WebElement frame1 = driver.findElement(By.xpath("(//div/iframe)[1]"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		String f1result = driver.findElement(By.xpath("//button[@id='Click']")).getText();
		System.out.println("After clicking the button in frame 1 message is :"+f1result);
		
		if(f1result.equals(f1msg)) {
			System.out.println("Result matched");
		}
		else
		{
			System.out.println("result not matched");
		}
		
		driver.switchTo().defaultContent();
		
		//nested i-frame concept
		WebElement frame3 = driver.findElement(By.xpath("(//div/iframe)[3]"));
		driver.switchTo().frame(frame3);
		System.out.println("frame-3 found");
		WebElement nestedf3 = driver.findElement(By.xpath("//body/iframe"));
		driver.switchTo().frame(nestedf3);
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		System.out.println("nested frame-3 button found");
		String f3result = driver.findElement(By.xpath("//button[@id='Click']")).getText();
		System.out.println("After clicking the button in frame 3 message is :"+f3result);
		
		if(f3result.equals(f1msg)) {
			System.out.println("Result matched");
		}
		else
		{
			System.out.println("result not matched");
		}
		
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		List<WebElement> frameCount = driver.findElements(By.xpath("//iframe"));
int noOframe = frameCount.size();
System.out.println("total number of frame in this page :"+noOframe);
for (WebElement frameElement : frameCount) {
	System.out.println("frameElements are as follows:"+frameElement);
	
}
	}

}
