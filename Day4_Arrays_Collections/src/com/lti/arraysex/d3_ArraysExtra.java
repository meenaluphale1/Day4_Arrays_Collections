package com.lti.arraysex;

import java.util.Arrays;

public class d3_ArraysExtra {

    static int[] classIntArray;

    public static void main(String... args) {

        String [] bugs = new String[] { "cricket", "beetle", "ladybug" };
        
        System.out.println(bugs);
                	
        System.out.println("\n----------------------------------------\n");

        System.out.println(Arrays.toString(bugs));       

        classIntArray = new int[] {1, 2, 3}; // Need to instantiate a new object to change the default values of the array

        System.out.println(Arrays.toString(classIntArray));

        System.out.println("\n----------------------------------------\n");

        int numbers[] = new int[] {6, 9, 1};

        Arrays.sort(numbers);

        for(Integer i : numbers) // Autoboxing with the sorted int array
            System.out.println(i + " "); // 1 6 9 

        System.out.println("\n");

        //Lexicographical order 
        
        //String[] strings = {"123", "9", "112", "0300"};
        String[] strings = {"aa", "aab", "abc", "p"};

        Arrays.sort(strings);    
        
        System.out.println(Arrays.toString(strings));
        
        
        
        
        
    
       
    }
}
