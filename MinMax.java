/*
* Copyright (c) 2020
*
* This program determines the maximum and the minmium number
* in an array consisting of 10 randomly generated numbers.
*
* @author  Wajd Mariam
* @version 1.0
* @since   2020/12/02
*/

// Imports Java Classes:
import java.util.Arrays;
import java.util.Random;

public class MinMax {
  /**
   * This function determines the maximum number in
   * the given array.
   */
  static int maxNumber(int [] array1) {
    
    // Declaring variables:
    int max = 0;
    
    // For loop to check every number in the array to determine the maximum number:
    for (int numberSelected = 0; numberSelected < 10; numberSelected++) {
      if (array1[numberSelected] > max) {
        max = array1[numberSelected];
      } else {
        continue;
      }
    }
    // return max;
    return max;
  }
  /**
   * This function generates the random number and prints it 
   * out to the user.
   */
   
  static int minNumber(int [] array1) {
    
    // Declaring variables:
    int min = 100;
    
    // For loop to check every number in the array to determine the minimum number:
    for (int numberSelected = 0; numberSelected < 10; numberSelected++) {
      if (array1[numberSelected] < min) {
        min = array1[numberSelected];
      }
    }
    // return min:
    return min;
  }
  /**
  * This function generates random numbers and appends them
  * in an array.
  */
  
  public static void main(String[] args) {
    // Random number generator:
    Random randomNumber = new Random();
    
    // Creating an array of integers: 
    int[] array1 = new int [10];
    // For loop to generate and append random numbers in the array:
    for (int counter = 0; counter < array1.length; counter++) {
      array1[counter] = randomNumber.nextInt(99) + 1;
    }
    // Printing out the array:
    System.out.println(Arrays.toString(array1));
    System.out.println("");
        
    // Calling maxNumber function:
    int maxNum = maxNumber(array1);
    System.out.println("The maximum number in the array is " + maxNum);
    System.out.println("");
        
    // Calling maxNumber function:
    int minNum = minNumber(array1);
    System.out.println("The minimum number in the array is " + minNum);
    System.out.println("");
  }
}