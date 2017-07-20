package com.acadglid.session3;

public class Assignment1 {
	
	public static String static_var = "Static Variable ";
	
	String nonStatic_var = "Non_Static Variable ";
	
	public static void main (String[] args) {
		
		// Static variable is access using className and by static function since main is static method can be used directly
		
		System.out.println(Assignment1.static_var); // Using class Name 
		System.out.println(static_var); // directly in static function 
		
		//Instance variable access while creating obj of the class.
		
		Assignment1 obj = new Assignment1();
		System.out.println(obj.nonStatic_var); // Using class Name 

		
		
		
		
		
		
	}

}
