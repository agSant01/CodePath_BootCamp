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
		
		//Converts string to char array so it could be iterable
		char[] charConvert = string.toCharArray();
		
		//Used to point the last position in reverse to the array
		int endIndex = charConvert.length - 1;
		
		for(int i = 0; i < charConvert.length/2; i++){
			if(charConvert[i] != charConvert[endIndex]){
				return false;
			}
			endIndex--;
		}
		return true;
	}

}
