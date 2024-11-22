package learnWebtables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClassroomWebTable {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		
		WebElement webTable = driver.findElement(By.xpath("//table[@class='table table-striped mt-3']"));
		List<WebElement> rowsCount = webTable.findElements(By.xpath("//table[@class='table table-striped mt-3']/tbody/tr"));
		int rowSize = rowsCount.size();
		System.out.println("Total no.of rows present in the table is : "+rowSize);
		
		/*
		 * for (int i = 0; i < rowSize; i++) { WebElement rowData = rowsCount.get(i);
		 * System.out.println("Data present in the "+i+" place is : "+rowData);}
		 */
		
		WebElement FirstRowData = rowsCount.get(0);
		
		List<WebElement> colsCount = FirstRowData.findElements(By.xpath("//table[@class='table table-striped mt-3']/tbody/tr[1]/td"));
		int colSize = colsCount.size();
		System.out.println("Total no.of columns present in the table is : "+colSize);
		ArrayList<Integer> agesList=new ArrayList<Integer>();
		
		List<WebElement> ageData = webTable.findElements(By.xpath("//table[@class='table table-striped mt-3']/tbody/tr/td[3]"));
		for (int i = 0; i < ageData.size(); i++) {
			String Ages = ageData.get(i).getText();
			System.out.println(Ages);
			int convertedAge = Integer.parseInt(Ages);
			agesList.add(convertedAge);
			
		}
	
				
		Integer minAge = Collections.min(agesList);
		System.out.println("The minimum agesd  from the table is :"+minAge);		
		
		String EmailofMinAges = driver.findElement(By.xpath("//td[3][contains(text(),'"+minAge+"')]/following-sibling::td[1]")).getText();
		System.out.println("Mail ids's are:"+EmailofMinAges);
	}

}
