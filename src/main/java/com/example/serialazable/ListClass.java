package com.example.serialazable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Stack;
import java.util.TreeSet;

public class ListClass {
	public static void main(String args[]) {

		/* ArrayList ---------------------------------------------------------- */
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		list.add("Ravi");// Adding object in arraylist
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		list.add("");
		// Traversing list through Iterator
		Iterator itr = list.iterator();
		System.out.println("ArrayList-------------------------------------------------");
		while (itr.hasNext()) {
			System.out.println("ArrayList----------" + itr.next());
		}
		// accessing the element
		System.out.println("Returning element: " + list.get(1));// it will return the 2nd element, because index starts
																// from 0
		// changing the element
		list.set(1, "setname");
		// Traversing list
		for (String getname : list) {
			System.out.println("getelemtnt---------" + getname);
		}
		
		//sorting-----
		
		//Sorting the list  
		  Collections.sort(list);  
		   //Traversing list through the for-each loop  
		  for(String sorting:list)  
		    System.out.println("sorting----"+sorting); 
		  
	        System.out.println("Traversing list through forEach() method:");  
	        //The forEach() method is a new feature, introduced in Java 8.  
	            list.forEach(a->{ //Here, we are using lambda expression  
	                System.out.println("for each iterstion"+a);  
	              });  

		/*
		 * Stack ------------------------------------------------------------------------------------------------------------*/
		Stack<String> stack = new Stack<String>();
		stack.push("Ravi");
		stack.push("Vijay");
		stack.push("Ravi");
		stack.push("Ajay");
		stack.push("");
		stack.push("Garima");

		stack.pop();
		Iterator<String> itr2 = stack.iterator();
		while (itr2.hasNext()) {
			System.out.println("stack----------" + itr2.next());
		}

		/* Hashset ---------------------------------------------------------- */

//Creating HashSet and adding elements  
		HashSet<String> set = new HashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		set.add("");
//Traversing elements  
		Iterator<String> itr3 = set.iterator();
		while (itr3.hasNext()) {
			System.out.println("HashSet-------" + itr3.next());
		}
		/* LinkedHashset ---------------------------------------------------------- */

		LinkedHashSet<String> set2 = new LinkedHashSet<String>();
		set2.add("Ravi");
		set2.add("Vijay");
		set2.add("Ravi");
		set2.add("Ajay");
		set2.add("");
		Iterator<String> itr4 = set2.iterator();
		while (itr4.hasNext()) {
			System.out.println("linkedhasthset      " + itr4.next());
		}
		/* LinkedHashset ---------------------------------------------------------- */

//Creating and adding elements  
		TreeSet<String> set1 = new TreeSet<String>();
		set1.add("Ravi");
		set1.add("Vijay");
		set1.add("Ravi");
		set1.add("Ajay");
		set1.add("");
//traversing elements  
		Iterator<String> itr41 = set1.iterator();
		while (itr41.hasNext()) {
			System.out.println(itr41.next() + "treesset");
		}
	}
}
