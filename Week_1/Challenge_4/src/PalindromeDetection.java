/**
 * PalindromeDetection.java
 *  
 *  
 * Created by Gabriel S. Santiago on 10/25/16.
 * Copyright © 2016 Gabriel S. Santiago. All rights reserved.
 *
 **/

public class PalindromeDetection {
	public static void main (String[] agrs){
		
		String m = "ho l a l oh"; //String to input; Change at will
		boolean flag;
		
		flag = palindromeDetector(m);
		
		System.out.println(flag);
	}
	
	public static boolean palindromeDetector(String string){
		int endIndex = string.length() - 1;
		
		for(int begin = 0; begin < string.length()/2; begin++){
			if(string.charAt(begin) != string.charAt(endIndex)){
				return false;
			}
			endIndex--;
		}
		return true;
	}
}
