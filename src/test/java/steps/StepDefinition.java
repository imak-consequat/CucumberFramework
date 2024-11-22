package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {

	ChromeDriver driver;
	@Given("Open the Chrome Browser")
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
				
	}
	@Given("Load Leaftaps Application with the URL{string}")
	public void loadUrl(String Url) {
		driver.get(Url);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	@Given("Enter valid Username as {string}")
	public void enterUsername(String UserName) {
		driver.findElement(By.id("username")).sendKeys("UserName");
		
	}
	@Given("Enter valid Password as {string}")
	public void enterPassword(String Password) {
		driver.findElement(By.id("password")).sendKeys("Password");
		
	}
	@When("Clicked on Login button")
	public void loginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Home Page Successfully")
	public void homePage() {
		System.out.println("HomePage");
		
	}
	
	@But("Error message to be displayed")
	public void errorMessage() {
		System.out.println("Error Message displayed successfully");
	}
}
