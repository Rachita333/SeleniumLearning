package javaBasics;

public class LearningLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		for(a=0; a<=50; a++ )
		{
			if(a==40)
			System.out.println(a); 
		}
		
		
		//while loop
		System.out.println("While loop started");
		int  b =100;
		while(b<=90)
		{
			System.out.println(b);
			b=b+1;
			
		}
		
		
		//do-while loop
		System.out.println("learning do  while");
		int c = 110;
		do
		{
			System.out.println(c);
			c++;
		}
		while(c<10);

	}

}
