package practiseJavaBasics;
public class IfElsePractise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if else take passing mark- if marks is between 60 to 90 then print first Class, if 50 to 60 then print 2nd class
		//if between 40 to 50 print 3rd class below 40 print fail
		
		//All marks will be stored in Integer variable
		//IfElsePractise1 m1 = new IfElsePractise1();
		//int marks(0);
		int a=99;
		int b=60;
		int c=50;
		int d=40;
		//dfine 1 var called marks
		//take input from user as marks ---scanner cals in java and buffer
	
		
		//.out.println("Enter marks");
		//m1.marks();
		
	
		if(a<=90 ||  a>=60 )  //a= 90 & b=60 //90>60 & 60<90
		{
			System.out.println("First Class Marks");
		}
		
		else if(b>c & c<b) //b=60 & c=50 //
		{
			System.out.println("Second Class Marks");
		}
		
		else if(c>d & d<c) //c=50 & d=40
		{
			System.out.println("Third Class Marks");
		}
		
		else
		{
			System.out.println("FAIL");
		}
		
	}

}
