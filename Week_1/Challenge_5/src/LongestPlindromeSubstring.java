/**
 * LongestPlindromeSubstring.java
 *  
 *  
 * Created by Gabriel S. Santiago on 10/25/16.
 * Copyright © 2016 Gabriel S. Santiago. All rights reserved.
 *
 **/

public class LongestPlindromeSubstring {
	public static void main (String[] args){
		String string = "abdbabbdba";
		String result;
		
		result = longestPlindromeSubstring(string);
		
		System.out.println(result);
	}
	
	public static String longestPlindromeSubstring(String string){
		if(string.isEmpty()){
			return null;
		} else if (string.length() == 1){
			return string;
		}	
		
		String subString = string.substring(0, 1);
		for (int i = 0; i < string.length(); i++){
			for(int j = i; j < string.length(); j++){
				if(isPalindrome(string.substring(i, j+1)) && 
						j-i+1 > subString.length())
				{
					subString = string.substring(i,j+1);
				}
			}
		}
		return subString;
	}
	
	public static boolean isPalindrome(String str){
		int end = str.length()-1;
		for (int begin = 0; begin < str.length(); begin++){
			if(str.charAt(begin) != str.charAt(end)){
				return false;
			}
			end--;
		}
		return true;
	}
}
