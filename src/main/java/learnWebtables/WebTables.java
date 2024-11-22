package learnWebtables;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTables {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://erail.in");
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		// source station
		WebElement From_Station = driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		From_Station.clear();
		From_Station.sendKeys("MAS",Keys.TAB);
		// destination station
		WebElement To_Station = driver.findElement(By.xpath("//input[@id='txtStationTo']"));
		To_Station.clear();
		To_Station.sendKeys("JTJ",Keys.TAB,Keys.TAB);
		
		// handle the table to get the list of trains available
		//find the web-table 
		WebElement traintable = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']"));
		//find the row details of the web-table using the table name and each rows tag name is 'tr' 
		 List<WebElement> tRows = traintable.findElements(By.tagName("tr"));
		 System.out.println("total number of rows available in the table : "+tRows.size());
		 
		 // find the no.of columns for a specific row by getting the first row data using get method
		 
		 WebElement firstRow = tRows.get(1);
	
		 List<WebElement> tColumn = firstRow.findElements(By.tagName("td"));
		 System.out.println("Total number of column spresent in the table :"+tColumn.size());
		 // now i need to get the data of 2nd column - train name from the table by iteration through for loop
		 // before that create an empty list to store the 2nd column data that is train name
		 List<String> TrainName=new ArrayList<String>();
		 for (int i = 1; i < tRows.size(); i++) {
			 
			 
			 WebElement allRows = tRows.get(i);
			// String rowdata = allRows.getText();
			/// System.out.println(rowdata);
		 List<WebElement> allcolumns = allRows.findElements(By.tagName("td"));
		 
		String allrow2col = allcolumns.get(1).getText();
			 TrainName.add(allrow2col);
			 System.out.println(allrow2col);
			 
		}
	}

}
