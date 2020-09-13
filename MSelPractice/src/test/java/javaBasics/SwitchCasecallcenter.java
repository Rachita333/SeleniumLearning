package javaBasics;

public class SwitchCasecallcenter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option = 2;
		int a=90;
		int b=40;
		int c=60;
		
		switch(option)
		{
		case 1:
			System.out.println("this is for caller tuner");
			if(a>b & a>c)
				System.out.println("A is greater");
			break;
			
		case 2:
			System.out.println("this is for sms");
			break;
			
		case 3:
			System.out.println("this is for serverce");
			break;
		case 4:
			System.out.println("this is for aaaa");
			break;
		case 5:
			System.out.println("this is for bbb");
			break;
			
			default:
				System.out.println("please press proper option");
			
		
		}

	}

}
