package excel2dataProvider2testcase;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DuplicateLead extends BaseClass {
	@Test(dataProvider="fetchData", priority=4)
	public void runDuplicateLead(String Mobile) throws InterruptedException {
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(Mobile);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.name("submitButton")).click();
	
}
	
	@DataProvider(name="fetchData")
	public String[][] getData() throws IOException {
		ReadExcel re=new ReadExcel();
		String[][] data = re.excelMethod("DuplicateLead");
		return data;

	}
}






