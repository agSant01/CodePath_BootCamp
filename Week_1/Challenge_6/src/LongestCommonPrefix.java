/**
 * LongestPlindromeSubstring.java
 *  
 *  
 * Created by Gabriel S. Santiago on 10/25/16.
 * Copyright © 2016 Gabriel S. Santiago. All rights reserved.
 *
 **/

public class LongestCommonPrefix {
	public static String longestCommonPrefix (String[] stringArray){
		
		if (stringArray == null || stringArray.length == 0){
			return null;
		} else if (stringArray.length == 1){
			return stringArray[0];
		}
		
		String result = "";
		char temp;
		int index = 0;
		
		for (String str : stringArray){
			if(str.isEmpty()){
				return result;
			}
			temp = str.charAt(index);
			for (String str2 : stringArray){
				if (str2.charAt(index) != temp){
					return result;
				}
			}
			result += temp;
			index++;
		}
		return result;
	}	
}
