package com.lti.arraysex;

import java.util.Scanner;

public class Demo1 {

	
	public static void main(String[] args) {
		
				
		int m[]= new int[] {10,20,30,40,50} ;// initn   int i=10; 
		
		//int m[]={10,20,30,40,50};
		
		boolean aryb[]= new boolean[3]; // declaration  int i ;
		
		System.out.println(aryb[0]);
		
		int arya[]= new int[3]; // declaration  int i ;
		
		System.out.println(arya[0]);
		
		
		// accept 5 marks of students  using an int ary 
		//find avg of marks //display it 
		
		/*
		 * int [] student= {10,20,30,40,50}; int sum=0;
		 * 
		 * for(int i=0;i<student.length;i++) {
		 * 
		 * sum=sum+student[i]; }
		 * 
		 * double avg=sum/student.length; System.out.println("avg"+avg);
		 */
		
		
		int[] marks = new int[5];
		float avg;
		int i,sum = 0;
		Scanner sc = new Scanner(System.in);
		
		for(i=0; i<marks.length;i++)
		{
		System.out.println(" enter marks ");
		marks[i] = sc.nextInt();
		}
		for(i=0; i<marks.length;i++)
			
		sum += marks[i];
		
		avg = sum/5;
		
		System.out.println(" avg is " + avg);
		
		
		
		
		
		
		
		
		
		
		
	}
}
