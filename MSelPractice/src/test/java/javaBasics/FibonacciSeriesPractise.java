package javaBasics;

public class FibonacciSeriesPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Fibonacci series is next num is sum of previous 2 numbers for example
		// 0,1,1,2,3,5,8,13 and so on
		// The First 2 numbers of Fibonacci series are 0 and 1

		int n1 = 0; 
		int n2 = 1;
		int n3;
		int count = 10;

		System.out.println(n1 + " " + n2); 

		for (int i = 2; i < count; ++i) {

			n3 = n1 + n2;
			System.out.println(" "+n3);
			n1 = n2;
			n2 = n3;
		}

	}

}
