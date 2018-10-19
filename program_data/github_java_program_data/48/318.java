package com.altimetrik.assignment.stringpalindrome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		InputStreamReader r=new InputStreamReader(System.in);  
		BufferedReader br=new BufferedReader(r);  
		  
		System.out.println("Enter the string:");  
		String s =br.readLine(); 
		
		int len= s.length();
		System.out.println("lenght of the string"+len);
		if(len>0)
		{
			
			System.out.println( s.toUpperCase());
		}

	StringBuffer b=new StringBuffer(s);
	b.reverse();
	if(String.valueOf(s).compareTo(String.valueOf(b))==0)
	
		System.out.println("palindrome");
	
		else
	        
		System.out.println("not palindrome");
	
	}
	}
	

	



