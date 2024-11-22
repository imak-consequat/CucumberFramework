package learnCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListLearnig {

public static void main(String[] args) {
		
/**synatx
List<String> listname = new ArrayList<String>(); 
List<Integer> listname = new ArrayList<Integer>();
<> are called as generics
Wrapper class:
int Integer
short Short
boolean Boolean
char Character
double Double
String String
byte Byte
long Long
float FloatS
**/

List<String> apartment = new ArrayList<String>();
		
		System.out.println("values are:"+apartment);
		
		apartment.add("Akshaya");
		apartment.add("January");
		apartment.add("Today");
		apartment.add("Orlando");
		apartment.add("AdAir");
		apartment.add("Adena");
		
		System.out.println("Items present inside the array list after addition is :"+apartment);
		int  size= apartment.size();
		System.out.println("Total size of the Array list is :"+size);
		String zeroIndexValue = apartment.get(0);
		System.out.println("Zero th index of the array list is:" +zeroIndexValue);
		apartment.add(0, "Tango");
		System.out.println("After adding value to zero th index of array list: "+apartment);
		apartment.remove(1);
		System.out.println("After removing item in 1st index of array list: "+apartment);
		apartment.remove("Tango");
		System.out.println("After removing item using the object name from the array list : "+apartment);
		//		values.clear();
		// System.out.println("after clearing every object from the values : "+values);
		Collections.sort(apartment);
		System.out.println("Values after sorting :"+apartment);
		Collections.reverse(apartment);
		System.out.println("Values after reverse sorting :"+apartment);
		//foreach
		// syntax ( datatype variable: source)
		// no index
		for (String eachstring : apartment) {
			System.out.println("each string as follows:"+eachstring);}
		System.out.println("normnal for loop");
		
		for(int i=0;i<apartment.size();i++) {
			String ivalue = apartment.get(i);
			System.out.println("in normal for loop printing the values:"+ivalue);}
		
		//copy values from one list to another list
		//create an empty array list
		
		System.out.println("How to copy values from one list to another array list");
		
		List <String> apartmentNew= new ArrayList <String>(apartment);
		
		for (String aftercopy : apartmentNew) {
			System.out.println("Copy values are :"+aftercopy); }
			
		apartmentNew.add("Earth");apartmentNew.add("Feburary");
		System.out.println("copied and added values are :"+apartmentNew);
		
		for (String copystring : apartmentNew) {
			System.out.println("copy values are :"+copystring); }
			
			//remove all
			
		apartmentNew.removeAll(apartment);
			for (String copystring : apartmentNew) {
				System.out.println("after revomed all values :"+copystring); }
			
		
			
	}

}
