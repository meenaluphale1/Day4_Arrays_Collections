package com.lti.coll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class demo2 {

	public static void main(String[] args) {
		
	/*
		List<Integer> numList= new ArrayList<>();
		numList.add(50);		
		numList.add(60);
		numList.add(80);
		numList.add(20);
		System.out.println(numList);
		
		Collections.sort(numList);
		
		System.out.println(numList);
		
		*/
		
	
		
		//equal  // ordering 
		
		Employee e1= new Employee(101,"jay",50000);
		Employee e2= new Employee(101,"jay",50000);
		Employee e3= new Employee(103,"sanjay",70000);
		
		//List<Employee>  empList= new ArrayList<>();
		Set<Employee>  empList= new TreeSet<>();
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		
		System.out.println(e1.equals(e2));
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		
		System.out.println(empList);
		//	Collections.sort(empList);
		//System.out.println(numList);
		
		
		
		
		
		
		
		
	}
}
