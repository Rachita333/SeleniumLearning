package javaBasics;

public class AssignmentOverloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int sum = add(2, 3); //calling of below function here by providing
		// values
		// System.out.println(sum); // up function is returning sum
		add(2, 3); //calling of below written function here by providing values
		add(2.1, 3, 3);
	}

	public static int add(int a, int b)// declaration of method with parameters
										// as a and b with integer type
	{

		int sum = a + b; // Declaration if variable type and operation performed
		System.out.println("sum is " + sum); // print
		return sum; // return type as sum
	}

	public static double add(double a, int b, int c) // declaration of method
														// with parameters as
														// a,b,c with double
														// type
	{
		double sum = a + b + c;
		System.out.println("sum is " + sum);
		return sum;
	}

}
