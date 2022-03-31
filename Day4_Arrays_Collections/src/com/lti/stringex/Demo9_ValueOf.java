package com.lti.stringex;


public class   Demo9_ValueOf
{
	public static void main(String[] args) 
	{
		char charArray[]={'a','b','c','d','e','f'};
		int i=7;
		System.out.println (" Char Array : " + String.valueOf(charArray));
	System.out.println (" Part of Char Array : " + String.valueOf(charArray,3,3));
		
		}
}

//you can convert int to string, long to string, boolean to string, 
//character to string, 
//float to string, double to string, 
//object to string and char array to string.