package oop;

public class Calculator {

	// method overloading : same method name - different parameters
	public static int multiply(int a,int b) {
		return a*b;
		
	}
	
	public static int multiply(int a,int b,int c) {
		return a*b*c;
	}
	
	public static String multpiply(String a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		
		int x = (multiply(10,2));
		
		int z = (multiply(10,2,3));
		
		
		System.out.println(x);
		
		System.out.println(z);
		
		
		
	}

}
