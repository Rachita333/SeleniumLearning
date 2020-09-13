package javaBasics;

import java.util.HashMap;

public class Collections_HashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Hash map is collection java
		// Hash Map stores (Key,Value) format
		// Here Key type is Integer and Value is String
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>(); 
		hm.put(1, "Tom");
		hm.put(2, "Tom1");
		hm.put(3, "Tom2");
		hm.put(4, ""); //null value
		hm.put(5, "");
		
		System.out.println(hm.get(3));

	}

}
