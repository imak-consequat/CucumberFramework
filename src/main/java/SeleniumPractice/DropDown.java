package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		
		
// Step : 01 - Setting up the WebDriver dependencies 
WebDriverManager.chromedriver().setup();

// Step : 02 - Creating an object of chromeDriver for the ChromeDriver class and storing it in a variable called driver (object reference)
ChromeDriver driver=new ChromeDriver();

// to maximize the browser
driver.manage().window().maximize();

//driver.get("https://www.leafground.com/select.xhtml");

// Step : 03 - configuring Test Data for application  : URL | UserName | Password.. these are declared in a string variable
String URL="http://leaftaps.com/opentaps/control/main", UN="DemoCSR", PWD="crmsfa";

// Step : 04 - Launching the Application in Browser by passing the URL as argument in the Get method of Driver object reference
driver.get(URL);

// Step : 05 - Identifying each login page elements and strong them into a variable which is of type WebElement -Return type:
WebElement UN_element = driver.findElement(By.id("username"));
WebElement PWD_element = driver.findElement(By.id("password"));
WebElement Login_element = driver.findElement(By.className("decorativeSubmit"));

// Step : 06 - Passing the User inputs into the identified webElements for the Login function by passing the user inputs as arguments using the send keys method.
UN_element.sendKeys(UN);
PWD_element.sendKeys(PWD);
Login_element.click();

// Step : 07 - Navigating to CRMSFA page, identifying the CRMSFA web element link and storing it in a variable of return type WebElemnt and then Clicking on the CRMSFA Link as user action 
WebElement CrmLink_element = driver.findElement(By.linkText("CRM/SFA"));
CrmLink_element.click();

// Step : 08 - Navigating to CRMSFA Page and identifying the Leads menu & Clicking it 
WebElement LeadsMenu_element = driver.findElement(By.linkText("Leads"));
LeadsMenu_element.click();

// Step :09 Navigation to Leads main page -Identify the Create Lead sub-menu and navigating to create lead page.
WebElement CreateLead_element = driver.findElement(By.linkText("Create Lead"));
CreateLead_element.click();

//Step : 10 Navigation to Create Leads  page -Configure Test data for using respective variables
String CompName="Pranav Cafe", ForeName="OmPrakash", SurName="Narayanan", FNL="Gulab", LNL="Jamun", 
Title="MR", Dept="IT",
// DOB="18/04/90",
Desc="Test Description 1234", ImpNote="sample Important Note", Email="test@test.com",
WebUrl="www.test.com", ToName="Prakash", AttName="Narayanan", AddL1="omr main road", AddL2="Senganmal",City="chennai",Extn="044-810085544", Phno="+91-9095555347", Salutation="Major";

int ParentAc=10050, AnnualRevenue=1500000, NoOfEmp=5, SicCode=5143, CountryCode=91, AreaCode=365, PostCode=603103, ZipCode=101;

// Step : 11 Identifying the Web elements required for create lead and then store it into a variable

WebElement CompName_element = driver.findElement(By.id("createLeadForm_companyName"));
WebElement ForeName_element = driver.findElement(By.id("createLeadForm_firstName"));
WebElement SurName_element = driver.findElement(By.id("createLeadForm_lastName"));
WebElement ParentAc_element = driver.findElement(By.id("createLeadForm_parentPartyId"));
WebElement FNL_element = driver.findElement(By.id("createLeadForm_firstNameLocal"));
WebElement LNL_element = driver.findElement(By.id("createLeadForm_lastNameLocal"));
WebElement Salutation_element = driver.findElement(By.id("createLeadForm_personalTitle"));
WebElement Title_element = driver.findElement(By.id("createLeadForm_generalProfTitle"));
WebElement Dept_element = driver.findElement(By.id("createLeadForm_departmentName"));
WebElement AnnualRevenue_element = driver.findElement(By.id("createLeadForm_annualRevenue"));
//WebElement DOB_element = driver.findElement(By.id("createLeadForm_birthDate"));
WebElement NoOfEmp_element = driver.findElement(By.id("createLeadForm_numberEmployees"));
WebElement SicCode_element = driver.findElement(By.id("createLeadForm_sicCode"));
WebElement Desc_element = driver.findElement(By.id("createLeadForm_description"));
WebElement ImpNote_element = driver.findElement(By.id("createLeadForm_importantNote"));
WebElement CountryCode_element = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
WebElement AreaCode_element = driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode"));
WebElement Phno_element = driver.findElement(By.id("createLeadForm_primaryPhoneNumber"));
WebElement Extn_element = driver.findElement(By.id("createLeadForm_primaryPhoneExtension"));
WebElement Email_element = driver.findElement(By.id("createLeadForm_primaryEmail"));
WebElement WebUrl_element = driver.findElement(By.id("createLeadForm_primaryWebUrl"));
WebElement ToName_element = driver.findElement(By.id("createLeadForm_generalToName"));
WebElement AttName_element = driver.findElement(By.id("createLeadForm_generalAttnName"));
WebElement AddL1_element = driver.findElement(By.id("createLeadForm_generalAddress1"));
WebElement AddL2_element = driver.findElement(By.id("createLeadForm_generalAddress2"));
WebElement City_element = driver.findElement(By.id("createLeadForm_generalCity"));
WebElement PostCode_element = driver.findElement(By.id("createLeadForm_generalPostalCode"));
WebElement ZipCode_element = driver.findElement(By.id("createLeadForm_generalPostalCodeExt"));

// Handling DropDown in the create lead page. need to identify the elements using locator and use select class and pass the element reference as argument in the select class.

WebElement SourceDD_element = driver.findElement(By.id("createLeadForm_dataSourceId"));
WebElement MktCampDD_element = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
WebElement IndustryDD_element = driver.findElement(By.id("createLeadForm_industryEnumId"));
WebElement OwnershipDD_element = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
WebElement CurrencyDD_element = driver.findElement(By.id("createLeadForm_currencyUomId"));
WebElement StateDD_element = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
WebElement CountryDD_element = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));

// Creating the Select class for each drop-down and passing the DD element variable reference into it

 Select SourceDD=new Select(SourceDD_element);
 SourceDD.selectByVisibleText("Existing Customer");
 
 Select MktCampDD = new Select(MktCampDD_element);
 MktCampDD.selectByIndex(1);
 
 Select IndustryDD = new Select(IndustryDD_element);
 IndustryDD.selectByValue("IND_SOFTWARE");
 
 Select OwnershipDD  = new Select(OwnershipDD_element);
 OwnershipDD.selectByVisibleText("LLC/LLP");
 
 Select CurrencyDD = new Select(CurrencyDD_element);
 CurrencyDD.selectByIndex(1);
 
 Select StateDD = new Select(StateDD_element);
 StateDD.selectByIndex(1);
 
 Select CountryDD = new Select(CountryDD_element);
 CountryDD.selectByIndex(1);
 
 // Passing the user inputs  as the declared & hard coded test data configuration above using the send keys method
 
 CompName_element.sendKeys(CompName);
 ForeName_element.sendKeys(ForeName);
 SurName_element.sendKeys(SurName);
 FNL_element.sendKeys(FNL);
 LNL_element.sendKeys(LNL);
 Salutation_element.sendKeys(Salutation);
 Title_element.sendKeys(Title);
  Dept_element.sendKeys(Dept);
 //DOB_element.sendKeys(DOB);
  Desc_element.sendKeys(Desc);
  ImpNote_element.sendKeys(ImpNote);
  Phno_element.sendKeys(Phno);
  Extn_element.sendKeys(Extn);
  Email_element.sendKeys(Email);
  WebUrl_element.sendKeys(WebUrl);
  ToName_element.sendKeys(ToName);
  AttName_element.sendKeys(AttName);
  AddL1_element.sendKeys(AddL1);
  AddL2_element.sendKeys(AddL2);
  City_element.sendKeys(City);
  
  // integers data cannot be passed into sendKeys method as it intakes only the string arguments. 
  //so, we need to convert the into String and the store it in a variable and then pass it in SendKeys method as string value
  String SicCodeStr=String.valueOf(SicCode);
  SicCode_element.sendKeys(SicCodeStr);
  
  String CountryCodeStr=String.valueOf(CountryCode);
  CountryCode_element.clear();
  CountryCode_element.sendKeys(CountryCodeStr);
  
  String ParentAcStr=String.valueOf(ParentAc);
 ParentAc_element.sendKeys(ParentAcStr);
 
 String AnnualReveStr=String.valueOf(AnnualRevenue);
  AnnualRevenue_element.sendKeys(AnnualReveStr);
  
  String NoOfEmpStr=String.valueOf(NoOfEmp);
  NoOfEmp_element.sendKeys(NoOfEmpStr);
  
  String AreaCodeStr=String.valueOf(AreaCode);
  AreaCode_element.sendKeys(AreaCodeStr);
  
  String PostCodeStr=String.valueOf(PostCode);
  PostCode_element.sendKeys(PostCodeStr);
  
  String ZipCodeStr=String.valueOf(ZipCode);
  ZipCode_element.sendKeys(ZipCodeStr);
  
// Submit => create lead 
  
WebElement CreateLeadBtn_element = driver.findElement(By.className("smallSubmit"));
CreateLeadBtn_element.click();

// Navigation to View Lead page

String ViewPageTitle_Expect = "View Lead | opentaps CRM";
String ViewPageTitle_Actual = driver.getTitle();

if(ViewPageTitle_Expect.equals(ViewPageTitle_Actual))
	
{
	System.out.println("Lead Created Successfully and page navigated to view leads page");
}
else {
	System.out.println("Problem while creating Lead, Please look into the code");
}

// Verify the Lead name in view lead page matches with value provided as input in create lead page

String ForeName_ViewLeadPage= driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
if(ForeName_ViewLeadPage.equals(ForeName))
{
	System.out.println("User input for create leads matches with the output-Lead created successfully");
}
else
{
	System.out.println("Failed to create lead");
}

String CompName_ViewLeadPage = driver.findElement(By.id("viewLead_companyName_sp")).getText();

// to separate the integer value from the received string value (alphanumeric) use below lines of code

int CompId=Integer.parseInt(CompName_ViewLeadPage.replaceAll("[^0-9]",""));
System.out.println("ComplayId after replacing the string to integer is: "+CompId);

// navigate to my leads page and check for data reflection

WebElement MyLeadsMenu_element = driver.findElement(By.linkText("My Leads"));
MyLeadsMenu_element.click();

WebElement LeadID_element = driver.findElement(By.linkText("Lead ID"));
LeadID_element.click();
//WebElement CompIDMyLead_element = driver.findElement(By.linkText("CompID"));


	}

}
