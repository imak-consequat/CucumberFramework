package FrequentlyAskedPrograms;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
//		Fibonacci series : A series of numbers in which each number(FN) is the sum of the two preceeding numbers
//		0+1 =1 , 1+1=2, 2+1=3, 3+2=5, 5+3=8, 8+5=13
		// 0 1 1 2 3 5 8 13 21 34
//		N1=0
//		N2=1
//		Fn1=N1+N2=1
//		
//		N1=N2
//		N2=Fn1
		
	
		int n1=0, n2=1, sum=0;
		System.out.print(n1+" "+n2);
		for (int i=2; i<10;i++) {
			sum=n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
		}
	}

}
