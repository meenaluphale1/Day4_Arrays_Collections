package com.lti.coll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class demo1ArrayList {

	public static void main(String[] args) {

		// Set<Double> myList= new TreeSet<>();
		List myList = new ArrayList(); // Object Data Type

		myList.add(200.00);
		myList.add(456.00);
		myList.add(500);
		myList.add(300.00);
		myList.add(300.00);
		myList.add("Jay");

		for (Object i : myList) {

			if (i.equals("Jay")) {
				System.out.println(" Jay exists ");
			}
		}

		System.out.println("\n");

		// System.out.println(myList.indexOf(500));
		// System.out.println(myList);

		// Employee e= null;
		// System.out.println(e.empId);

		// ArrayList.sort(myList);
		// ArrayList<Double>.sort(mylist);

		// Collections.sort(myList);
		// System.out.println(myList);
		// myList.remove(2);
		// System.out.println(myList);

		// add 150 begining
		// add 150 before 100

		Employee e = new Employee(101, "Jay",5000);
		Book b1 = new Book(1111, "Java", 500, 1000);

		List list = new ArrayList();

		list.add(e);
		list.add(b1);

		// fail fast iterators		

		Iterator itr = list.iterator();

		while (itr.hasNext()) {

			//list.add(e);
			list.remove(b1);
			System.out.println(itr.next());
		}

		// Employee e=(Employee) list.get(0);

		/*
		 * for(Object i: list) { System.out.println(i); }
		 */

	}

}
