package basics;

public class LearnString {

	public static void main(String[] args) {
		String sentence = "Learn all about String in Java";

		// total length of the sentences , we use the length() method of string . where
		// as in array we use .length alone where it is property not method

		int lengthOfSentence = sentence.length();
		System.out.println("Length of the text is:" + lengthOfSentence);

		// charAt() method is used to find the character at given position
		char lastChar = sentence.charAt(lengthOfSentence - 1);
		char charInPosition = sentence.charAt(5 - 1);
		System.out.println("lastletter is:" + lastChar);
		System.out.println("Character at the given Position is:" + charInPosition);

		// to get the position of the given character in a string use indexOf() ,
		// it gives the position of the first occurrence of the character, TypeSpecific
		// as well, if not found provides negative values.
		int indexOfCharacter = sentence.indexOf('S');

		System.out.println("Index of given character is: " + indexOfCharacter);

		int indexOfCharacter1 = sentence.indexOf('a');

		System.out.println("Index of given character is: " + indexOfCharacter1);

		// to get the last occurrence

		int indexOfCharacter2 = sentence.lastIndexOf('a');

		System.out.println("Index of given character is: " + indexOfCharacter2);

		// to convert the string into charter array use the method toCharArray()

		char[] c= sentence.toCharArray();
		System.out.println(c);
		System.out.println(c.length);
		
		for(int i=0;i<c.length;i++) {
			System.out.println("charArray["+i+"]:"+c[i]);
		}

		// from the given sting separate each word 
		
		String[] newSentence=sentence.split(" ");
		System.out.println("newSentenceLength:"+newSentence.length);
		for(int i=0;i<newSentence.length;i++) {
			System.out.println("string array index ["+i+"] holds the string value:"+newSentence[i]);
					}
		String name="Ashok kumar Mohan (12345)";
		
		String replaceAll = name.replaceAll("Ashok", "Ajith");
		System.out.println("replacing the first name : "+replaceAll);

		String replaceAll2 = name.replaceAll("[\\d]",""); // to replace & print the non-integers
		System.out.println("replaceing the non integers :"+replaceAll2); // output: Ashok kumar Mohan ()
		
		String replaceAll3 = name.replaceAll("[\\D]",""); // to replace & print the integers
		System.out.println("replaceing the non integers :"+replaceAll3); // output: 12345
	
		
		String str1 = "Chittu";
		String str2="Chittu";
			
		boolean equals = str1.equals(str2);
		System.out.println(equals);
		
		String str3=new String("Pattu");
		String str4=new String("Pattu");
		
		if(str3==str4) {
			System.out.println("equals");
		}
		else {
			System.out.println("not equals");
		}
		
		if(str1==str2) {
			System.out.println("equals");
		}
		else {
			System.out.println("not equals  ");
		}
	}

}
