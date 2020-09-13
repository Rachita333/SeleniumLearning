package javaBasics;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HondaCity hc = new HondaCity();
		hc.fuelCar();//parent
		hc.hondaCitySafety();//child
		
		//if same name function is present in both parent clas and child clas
		//then child clas function will be executed
		//this concept is know as static polymorphism or compiletime polymorphism
		//OR function overriding
		hc.startCar();//child class 
		hc.stopCar();//parent
		
		System.out.println("*************************************");
		
		Car ca = new Car();
		ca.fuelCar();
		ca.startCar();
		ca.stopCar();
		
		System.out.println("*******************************++++++++++++*");
		
		
		
		Car ca1 = new HondaCity();
		// child clas object can be refered by parent clas refrence variable
		//this is called runtime OR dynamic polymorphism
		ca1.fuelCar();//parent
		ca1.startCar();/// child clas
		ca1.stopCar();//parent
		
		///Assignment-- create one package practJavaBasics
		/// practise all concepts by writing your own 
		/// code to write if-else, loops, switch, function overloading, inheritance, static and dynamic polymorphism
		/// if else take passing mark- if marks is between 60 to 90 then print fist class, if 50 to 60 then print 2nd class
		//if between 40 to 50 print 3rd class below  40 print fail
		
		//for switch case print interest rate , it will vary between 1-9 
		
		//loops- loop will start from 50, decrement till 0, decrement should hapen by 2
		//i=50; i<=0; i=i-2
		
		//function overloading
		// write programe to substract with 2 and 3 parameters, nos in float and int
		//write a program to learn inheritance concept
		//1. create bank classs with 3 functions- custname, cust address, interest rate
		//2. create icic bank and write 3 functions - interest rate , open ppf account
		//3. create testbank class and call finctions accordinglt by using static and dynamic polymorphism
		

	}

}
