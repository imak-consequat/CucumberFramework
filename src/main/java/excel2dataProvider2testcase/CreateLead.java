package excel2dataProvider2testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CreateLead extends BaseClass {
	
	@Test(dataProvider="fetchData", priority=1)
	public  void runCreateLead(String CompanyName, String FirstName, String LastName, String Mobile) {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(CompanyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FirstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LastName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(Mobile);
		driver.findElement(By.name("submitButton")).click();
		
}
	
	@DataProvider(name="fetchData")
	private String[][] getData() throws IOException {
		ReadExcel re=new ReadExcel();
		String[][] data = re.excelMethod("CreateLead");
		return data;
	}
}






