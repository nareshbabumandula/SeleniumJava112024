package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * 1. The ArrayList class implements the List interface. 
 * 2. It uses a dynamic array to store the duplicate element of different data types. 
 * 3. The ArrayList class maintains the insertion order and is non-synchronized. 
 * 4. The elements stored in the ArrayList class can be randomly accessed. 
 * 5. It allows duplicate elements
 * @author ADMIN
 *
 */
public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		// Create an object for ArrayList class
		ArrayList<String> alist = new ArrayList<>();
		alist.add("Sowjanya");
		alist.add("Aarthi");
		alist.add("Preethi");
		alist.add("Sathya");
		alist.add("Shravan");
		alist.add("Naresh");
		alist.add("Sowjanya");
		alist.add("Ravi Kiran");
		alist.remove(0);
		alist.add(0, "Ramya");
		System.out.println(alist);
		System.out.println(alist.contains("Sai"));
		System.out.println(alist.get(1));
		System.out.println(alist.isEmpty());
				
		System.out.println("Looping through the collection via for loop");
		for (int i = 0; i < alist.size(); i++) {
			System.out.println(alist.get(i));			
		}
		
		System.out.println("Looping through the collection via for loop in reverse order");
		for (int i = alist.size()-1; i>=0; i--) {
			System.out.println(alist.get(i));			
		}
		
		System.out.println("Looping through the collection via enhanced for loop");
		for (String student : alist) {
			System.out.println(student);	
		}
		
		System.out.println("Looping through the collection via iterator");
		Iterator<String> iter = alist.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());	
		}
		
		System.out.println("Looping through the collection via lambda");
		alist.forEach(employee->System.out.println(employee));
		
		ArrayList<String> arrlist = new ArrayList<>();
		arrlist.add("John");
		arrlist.add("Ajay");
		arrlist.add("Shobha");

		alist.addAll(arrlist);
		System.out.println("Looping through the collection via lambda after merging both the collections");
		alist.forEach(employee->System.out.println(employee));
		
		ArrayList<String> arrList = new ArrayList<>();
		List<String> arList = new ArrayList<>(); //Upcasting: Converting the sub type to its immediate super type.After up casting we can access only the unique methods of parent class and overridden methods of child class

	}

}
