package javaBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticeIfelse {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		int marks;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader br1= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your marks between 0 to 100");
		marks = Integer.parseInt(br.readLine());
		System.out.println("Your entered marks is " + marks);
		
		if (marks>=60)
		{
			System.out.println("You got first calss");
		}
		
		else if(marks<60 & marks >=50)
		{
			System.out.println("you got 2nd class");
		}
		
		else if(marks<=49 & marks >=35)
		{
			System.out.println("you got 3rd class");
		}
		
		else{
			System.out.println("fail");
		}

	}

}
