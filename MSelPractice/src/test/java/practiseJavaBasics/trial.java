package practiseJavaBasics;

public class trial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//if else take passing mark- if marks is between 60 to 90 then print first Class, if 50 to 60 then print 2nd class
				//if between 40 to 50 print 3rd class below 40 print fail
				
				//All marks will be stored in Integer variable
				int num = 0;
				int a=90;
				int b=60;
				int c=50;
				int d=40;
				
				System.out.println("Enter marks");
			
				if(num > b & num <a )  //a= 90 & b=60 //90>60 & 60<90
				{
					System.out.println("First Class Marks");
				}
				
				else if(num>c & num<b) //b=60 & c=50 //
				{
					System.out.println("Second Class Marks");
				}
				
				else if(num>d & num<c) //c=50 & d=40
				{
					System.out.println("Third Class Marks");
				}
				
				else
				{
					System.out.println("FAIL");
				}
			}

			private void IfElsePractise1() {
				// TODO Auto-generated method stub
				
			}

			private static void marks() {
				// TODO Auto-generated method stub
				
			}

		}
