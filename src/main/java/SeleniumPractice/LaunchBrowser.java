package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		// here we manually checked browser version, downloaded driver & then set the system property file path,etc
		//if matched it is the successful  one , if there is an version update browserVersion vs DriverVersion not match,if we run it wont work
		// step 1: setup chromeDriver
		WebDriverManager.chromedriver().setup();
		/*
		 * String Property=System.getProperty("webdriver.chrome.driver", "path");
		 * System.out.println(Property);
		 */
		// Step 2: initialize or instantiate the chromeDriver and launch browser
		ChromeDriver driver=new ChromeDriver();
		//step 3: Load the URL
		
		/*
		 * URL:http://leaftaps.com/opentaps/control/main 
		 * Un:demosalesmanager 
		 * pwd:crmsfa
		 */
		
		driver.get("http://leaftaps.com/opentaps/control/main");		
		WebElement UserName = driver.findElement(By.id("username"));
		UserName.sendKeys("DemoCSR");
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		String expectedHomePageTitle = "Leaftaps - TestLeaf Automation Platform";
		String  actualHomePageTitle=driver.getTitle();
		if(expectedHomePageTitle.equals(actualHomePageTitle)) 
		{
		System.out.println("Landed in Home Page");	
		}
		else
		{
			System.out.println("Landing Failed");
		}
		
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		String ExpectedCRMPageTitle = "My Home | opentaps CRM";
		String ActualCRMPageTitle = driver.getTitle();
		
		if(ExpectedCRMPageTitle.equals(ActualCRMPageTitle))
		{
			System.out.println("Crm page landing success");
		}
		else
				{
			System.out.println("CRM page landing failed");
		}
		
		driver.findElement(By.linkText("Leads"));
		String ExpectedLeadsPageTitle="My Leads | opentaps CRM";
		String ActualLeadsPageTitle=driver.getTitle();
		if(ExpectedLeadsPageTitle.equals(ActualLeadsPageTitle))
		{
			System.out.println("Leads page landed successfully");
		}
		else
		{
			System.out.println("Laads page not landed");
		}
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		String expCreateLeadPageTitle="Create Lead | opentaps CRM";
		String actCreateLeadPageTitle=driver.getTitle();
		
		if(expCreateLeadPageTitle.equals(actCreateLeadPageTitle))
		{
			System.out.println("create leade page landed successfully");
		}
		else
		{
			System.out.println("create leade page not loaded");
		}
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		String FirstName = "Arnav";
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FirstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
		WebElement countrycode=driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countrycode.clear();
		Thread.sleep(2000);
		countrycode.sendKeys("91");
		driver.findElement(By.name("submitButton")).click();
		String Ex_viewLeadsPageTitle = "View Lead | opentaps CRM";
		String Ac_viewLeadsPageTitle = driver.getTitle();
		if(Ex_viewLeadsPageTitle.equals(Ac_viewLeadsPageTitle))
		{
			System.out.println("Lead crated successfully & landed in view page");
		}
		else
		{
			System.out.println("Lead creation failed");
		}
		
		String FN= driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("name:"+FN);
		if(FN.equals(FirstName))
		{
			System.out.println("Names is correct");
		}
		else
		{
			System.out.println("name is incorrect");
		}
		/*
		 * driver.findElement(By.linkText("My Leads")).click();
		 * 
		 * String Expagetitle=driver.getTitle();
		 * 
		 * if(Expagetitle.equals(ExpectedLeadsPageTitle)) {
		 * System.out.println("navigated to my leads page successfully"); } else {
		 * System.out.println("navigation to my leads failed"); }
		 */
		
		//driver.findElement
		//driver.findElement(By.className("decorativeSubmit")).click();
		
		
		
		
		
		
	}

}
