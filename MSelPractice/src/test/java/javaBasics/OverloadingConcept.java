package javaBasics;

public class OverloadingConcept {
	
	static int z=9;///global variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = add(3,5);
		System.out.println(s);
		
		add(2.7,9);
		
		
	}
	
	
	
	public static int add(int a,int b)
	{
		int k=90;//local variable
		System.out.println("Z value is is " + z);
		System.out.println("K value is is " + k);
		int sum = a+b;
		System.out.println("sum is " + sum);
		return sum;
	}
	
	public static void add(double a,int b)
	{
		System.out.println("Z value is" + z);
		double sum = a+b;
		System.out.println("sum is " + sum);
	}
	
	public void add(int b, double a)
	{
		
	}
	
	public static int add(int c, int d, int e)
	{
		int sum = c+d+e;
		return sum;
	}


}
