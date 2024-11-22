package FrequentlyAskedPrograms;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10,b=20;
System.out.println("the values are A:"+a+" & B is :"+b);

//Logic:1 initialize third variable
 		int t=a;
 			a=b;
 			b=t;
		System.out.println("After swapping the values are A:"+a+" & B is :"+b);
//Logic:2 by addition and subtraction without initializing third variable
		
		a=a+b;//10+20=30
		b=a-b;//30-20=10
		a=a-b;//30-10=20
		System.out.println("After swapping the values are A:"+a+" & B is :"+b);
	}

}
