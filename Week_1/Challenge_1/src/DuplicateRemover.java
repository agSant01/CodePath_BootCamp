/**
 * DuplicateRemover.java
 *  
 * 
 * Created by Gabriel S. Santiago on 10/25/16.
 * Copyright © 2016 Gabriel S. Santiago. All rights reserved.
 *
 **/

public class DuplicateRemover {
	public static int duplicateRemover(int[] sortedList){
		int arrayLength = sortedList.length;
		int index;

		if(arrayLength <= 1 || sortedList == null){
			return arrayLength;
		}
		for (int i = 0; i < arrayLength ; i ++){
			index = i + 1;
			//Verifies if index is in the array bounds
			//If selected number is equal to the index:
			//		I. Set index as 0
			//  II. Move to next index
			while(index < arrayLength && sortedList[i] == sortedList[index]){
				sortedList[index] = 0;
				index++;
			}
		}

		//Travels through the array to move 0's to the right end
		for(int i = 0; i < arrayLength; i++){
			index = i;
			if(sortedList[index] == 0){
				//Moves through until a non-zero is found
				while(sortedList[index] == 0){
					//Verifies if index is in the array bounds
					if(index+1 >= arrayLength){
						break;
					}
					index++;
				}
				//Changes positions between the zero and the non-zero
				sortedList[i] = sortedList[index];
				sortedList[index] = 0;
			}
		}
		index = 0;
		while(sortedList[index] != 0){
			index++;
		}
		return index;
	}
}
