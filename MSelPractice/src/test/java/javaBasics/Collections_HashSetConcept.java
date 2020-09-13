package javaBasics;

import java.util.HashSet;
import java.util.Iterator;

public class Collections_HashSetConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hashset contains only unique val
		//insertion oreder is not preserved
		
		HashSet <String> hst = new HashSet<String>();
		
		hst.add("India");
		hst.add("Goa");
		hst.add("India");
		hst.add("UK");
		hst.add("Manali");
		hst.add("she");
		hst.add("he");
		hst.add("we");
		hst.add("we");
		
	System.out.println(hst);
	
	//iterator concept
	//iterator is used for traversing elements
	
   Iterator<String> itr  =	hst.iterator();
   System.out.println(itr.next());
  
	
   while(itr.hasNext())
   {
	   System.out.println(itr.next());
   }
		

	}

}
