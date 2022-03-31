package com.lti.stringex;

public class demo1 {
	public static void main(String[] args) {
		
		String s1="meenal";
		String s2="uphale";
		
		String s3= new String("uphale");

		System.out.println(s1==s2); 
		System.out.println(s1==s3);
		
		if(s2.equals(s3))
		{
			System.out.println("login");
		}
		else
		{
			System.out.println("error");
		}

		
		
	}
}
