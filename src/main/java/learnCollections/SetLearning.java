package learnCollections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetLearning {

	public static void main(String[] args) {
		Set<String> malls=new LinkedHashSet <String>();
		malls.add("The Marina");
		malls.add("Vivira");
		malls.add("Phoenix Market City");
		malls.add("Express Avenue");
		malls.add("Vivira");// duplicates not allowed in set will not be printed in output
		
		System.out.println(malls);//[The Marina, Vivira, Phoenix Market City, Express Avenue]
		
		
		// get(index) is not supported for set--using for loop is not possible because we dont have index to pass in iteration
		for (String mallname : malls) {
			System.out.println(mallname);
			
		}
		
		// to access any of the object in set convert the set to list and then can be accessed.
		System.out.println("Conversion of set to list and values are:");
		List<String> mallslist=new ArrayList<String>(malls);
		System.out.println(mallslist);
		for (String mallname : malls) {
			System.out.println(mallname);
			
		}
	}

}
