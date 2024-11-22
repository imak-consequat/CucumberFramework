package oopsPolymorphism;

public class Calculator {
	
	public void add(int a, int b)
	{
		int result=a+b;
		System.out.println(" Add mehtod with two int agrs passed and the value of A is: "+a+" & the value of B is : "+b+" & the result is : "+result);
	}
	public void add(int a , int b, int c)
	{
		int result=a+b+c;
		System.out.println(" Add mehtod with two int agrs passed and the value of A is: "+a+" & the value of B is : "+b+" & the value of C is : "+c+" & the result is : "+result);
	}
	public void multiply(int a, int b) {
		int result=a*b;
		System.out.println(" Add mehtod with two int agrs passed and the value of A is: "+a+" & the value of B is : "+b+" & the result is : "+result);
	}
	public void multiply(int a, double b) {
		double result=a*b;
		System.out.println(" Add mehtod with two int agrs passed and the value of A is: "+a+" & the value of B is : "+b+" & the result is : "+result);
	}
	public void subtract(int a, int b) {
		int result=b-a;
		System.out.println(" Add mehtod with two int agrs passed and the value of A is: "+a+" & the value of B is : "+b+" & the result is : "+result);
	}
	public void subtract(double a , double b) {
		double result=a-b;
		System.out.println(" Add mehtod with two int agrs passed and the value of A is: "+a+" & the value of B is : "+b+" & the result is : "+result);
	}
	public void divide(int a , int b) {
		int result=a/b;
		System.out.println(" Add mehtod with two int agrs passed and the value of A is: "+a+" & the value of B is : "+b+" & the result is : "+result);
	}
	public void divide(int a, double b) {
		double result=a/b;
		System.out.println(" Add mehtod with two int agrs passed and the value of A is: "+a+" & the value of B is : "+b+" & the result is : "+result);
	}

	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add(5,10);
		calc.add(10,20,30);
		calc.multiply(5,20);
		calc.multiply(11,55.20);
		calc.subtract(55.99,66.25);
		calc.subtract(19,21);
		calc.divide(523,15.4);
		calc.divide(10,5);
	}
}
