package parameterization;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CreateLead extends BaseClass {
	
	@Test(dataProvider="fetchData")
	public  void runCreateLead(String CompanyName, String FirstName, String LastName, String Mobile) {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(CompanyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FirstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LastName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(Mobile);
		driver.findElement(By.name("submitButton")).click();
		
}
	
	@DataProvider(name="fetchData")
	private String[][] dp() {
		String[][] data=new String[2][4];
		data[0][0]="Alphabet Corp";
		data[0][1]="Alber";
		data[0][2]="Einstein";
		data[0][3]="9095555347";
		data[1][0]="MicrosoftInc";
		data[1][1]="Michael";
		data[1][2]="Jackson";
		data[1][3]="9095555348";
		return data;

		
		

	}
}






