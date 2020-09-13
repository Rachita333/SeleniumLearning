package javaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int i[] = new int[4];// static array because size is fixed
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[3]);
		//System.out.println(i[5]);
		
		String j[] = new String[5];
		j[0] = "rachi";
		j[1] = "Pravesh";
		j[2] = "Vishal";
		j[3] = "Bhupi";
		j[4] = "Tina";
		
		System.out.println(j.length);// length of array we can find by this function
		//object class is a Super/Parent class of all classes in Java
		
		Object obj[] = new Object[3];
		obj[0] = "Dipa";
		obj[1] = 10;
		obj[2] = 2.1;
		
		System.out.println(obj[0]);
	}

}
