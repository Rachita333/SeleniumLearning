package javaBasics;

import java.util.ArrayList;

public class Collections_ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		//Array List which contain more than 1 type of data is called Non-Generic
		//arraylist can contains duplicate value
		//insertion oreder is preserved
		ArrayList ar = new ArrayList();

		ar.add(1);
		ar.add(2);
		ar.add(34);
		ar.add("Joy");
		ar.add("Joy");
		ar.add(3.1);
		ar.add("R@chii!");
		ar.add(4);
		System.out.println(ar);
		
		System.out.println(ar.size()); // size function is used to find length of array
		System.out.println(ar.get(5));
		
		//Array List which contains same type of data is called Generic
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("qw");
		ar1.add("Hitesh");
		System.out.println(ar1.get(1));
		

	}

}
