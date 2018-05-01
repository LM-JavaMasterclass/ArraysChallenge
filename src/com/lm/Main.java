package com.lm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // Created by Laura Macia: April 2018
    // Udemy Complete Java Masterclass with Tim Buchalka
    // Answer to Challenge: Arrays
    // Create a program using arrays that sorts a list of integers in descending order.
    // Descending order is highest value to lowest.
    // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
    // ultimately have an array with 106,81,26, 15, 5 in it.
    // Set up the program so that the numbers to sort are read in from the keyboard.
    // Implement the following methods - getIntegers, printArray, and sortIntegers
    // getIntegers returns an array of entered integers from keyboard
    // printArray prints out the contents of the array
    // and sortIntegers should sort the array and return a new array containing the sorted numbers
    // you will have to figure out how to copy the array elements from the passed array into a new
    // array and sort them and return the new sorted array.

    private static Scanner scanner = new Scanner (System.in);

    public static void main(String[] args) {
        int[] myArray = getIntegers(7);

        int [] sortedArray = sortIntegers(myArray);
        printArray(sortedArray);

    }

    public static int[] getIntegers (int length) {
        int [] array = new int[length];
        System.out.println("Enter " + length + " integers:");
        for (int i=0; i<length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] sortIntegers (int[] arrayOriginal) {
//
// Following doesn't work to create a copy, as it just directs to the original array

         // int[] sortedArray = arrayOriginal;

        //Thus, two methods for copying the array.
        //Initialize new array of same length, then
        // With a for loop, initializing each position, or:

        int[] sortedArray = Arrays.copyOf(arrayOriginal, arrayOriginal.length);

        int i = 0;

        while (i < (arrayOriginal.length-1)){
            if (sortedArray[i]<sortedArray[i+1]){
                int holder = sortedArray[i];
                sortedArray[i] = sortedArray [i+1];
                sortedArray[i+1] = holder;
                if (i>0){
                    i--;
                } else {
                    i++;
                }
            } else i++;

        }
        return sortedArray;
    }

    public static void printArray (int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.println("Element " + i + ": " + array[i]);
        }
    }
}
