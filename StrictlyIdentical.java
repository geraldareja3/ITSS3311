/*
 * Sample run test:
 * Enter 5 elements of list1: 1 2 3 4 5
 * Enter 5 elements of list2: 1 2 3 4 5
 * Two lists are strictly identical
 */

import java.util.Scanner;

public class StrictlyIdentical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner input = new Scanner(System.in);
	    //Prompts the user to enter 5 sets of numbers for list 1 
	    System.out.print("Enter 5 elements of list1: "); 
	    
	    //Declared the size of list 1 as 5
	    int[] list1 = new int[5]; 
	    /*In this for loop, I set the initializer as zero. 
	    Also, if the initializer is less than 5 then it will add one to the initializer and will execute the statement within the loop.*/
	    for (int i = 0; i < 5; i++) { 
	    	//The 5 elements entered by the user for list 1 are assigned in list1[1]
	        list1[i] = input.nextInt(); 
	    }

	    //Prompts the user to enter 5 sets of numbers for list 2
	    System.out.print("Enter 5 elements of list2: ");

	    //Declared the size of list 2 as 5
	    int[] list2 = new int[5];
	    /*In this for loop, I set the initializer as zero. 
	    Also, if the initializer is less than 5 then it will add one to the initializer and will execute the statement within the loop.*/
	    for (int i = 0; i < 5; i++) {
	    	//The 5 elements entered by the user for list 2 are assigned in list2[1]
	        list2[i] = input.nextInt();
	    }

	    //This closes the Scanner
	    input.close();

	    /*
	     * I invoked the boolean method equals to pass the two arrays. If the return type is true 
	     * then display that the lists are strictly identical otherwise, display that lists are not strictly identical.
	     */
	    if (equals(list1, list2)) {
	        System.out.println("Two lists are strictly identical");
	    } else {
	        System.out.println("Two lists are not strictly identical");
	    }
	}
	
	//I created this method header to pass two arrays and return a Boolean.
	public static boolean equals(int[] array1, int[] array2) {

		//If the length of array 1 doesn't equal to array 2, then the program will return false
	    if (array1.length != array2.length) {
	        return false;
	    }

	    /*
	     * In this for loop, I set the initializer as zero.
	     * Also, if the initializer is less than the length of array 1, 
	     * then it will add one to the initializer and will execute the statement within the loop
	     */
	    for (int i = 0; i < array1.length; i++) {
	    	/*
	    	 * If the index of array 1 doesn't equal to the index of array 2, then it will return false. 
	    	 * Otherwise, it will return true outside the for loop.
	    	 */
	        if (array1[i] != array2[i]) {
	            return false;
	        }
	    }

	    return true;
	}

}
