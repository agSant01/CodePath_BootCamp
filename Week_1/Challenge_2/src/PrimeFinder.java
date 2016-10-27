/**
 * PrimeFinder.java
 *  
 *  
 * Created by Gabriel S. Santiago on 10/25/16.
 * Copyright © 2016 Gabriel S. Santiago. All rights reserved.
 *
**/

public class PrimeFinder {

	public static void main(String[] args){
		int n = 100; //Argument passed to the PrimeFinder function
		int[] result;
		
		result = primeFinder(n);

		for(int i : result){
			System.out.print(i + " ");
		}
	}

	public static int[] primeFinder(int n){
		double R;
		int c; //Used as a counter
		//Boolean array to mark primes
		//1 = not-prime
		//0 = prime
		boolean[] primesBoolean = new boolean[n];
		
		int[] result; //Array in which result are Returned
		
		R = Math.floor(Math.sqrt(n)); //Efficiency purpose
		/**  No prime factor of a number is greater
		 * 	 than its squared root.
		 **/
		for(int i = 2;i <= R; i++){
			if(primesBoolean[i] == true){ 
				//If marked as a not-prime: continue
				continue;
			}
			for(int j = i*i; j < n; j += i){
				//If it has a factor: mark as a prime
				primesBoolean[j] = true;
			}
		}
		
		//Counts how many primes exists to initialize the result array
		c = 0;
		for(int i = 2; i < primesBoolean.length; i++){
			if(primesBoolean[i] == false){
				c++;
			}
		}
		
		//Initialize the size of the result array
		//with the amount of prime
		result = new int[c];
		
		
		/**
		 * Pass all the primes in the result array
		 */
		c = 0;
		for(int i = 2; i < primesBoolean.length; i++){
			if(primesBoolean[i] == false){
				result[c] = i; 
				c++;
			}
		}

		return result;
	}
}
