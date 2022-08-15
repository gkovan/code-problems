package com.example.demos.august2022practice;

import java.util.Arrays;
import java.util.PriorityQueue;

/*
 * Find the 2nd smallest and 2nd largest numbers in a very large array.
 */
public class SmallestAndLargest {

    public static class MyResult {
        public int secondSmallest;
        public int secondLargest;
    }

    private static MyResult findSecondSmallestAndSecondLargestNumber2(int inputArray[]) {

        int smallest = inputArray[0];
        int secondSmallest = inputArray[0];
        int largest = inputArray[0];
        int secondLargest = inputArray[0];

        for (int i = 1; i < inputArray.length; i++) {

            if (inputArray[i] < smallest) {
                secondSmallest = smallest;
                smallest = inputArray[i];
            } else if ( inputArray[i] > smallest && inputArray[i] < secondSmallest ) {
                secondSmallest = inputArray[i];
            }

            if (inputArray[i] > largest) {
                secondLargest = largest;
                largest = inputArray[i];
            } else if ( inputArray[i] < largest && inputArray[i] > secondLargest) {
                secondLargest = inputArray[i];
            }
        }

        MyResult result = new MyResult();
        result.secondLargest = secondLargest;
        result.secondSmallest = secondSmallest;
        return result;
    }

    // complexity is O(n) is nlog(n)
    private static MyResult findSecondSmallestAndSecondLargestNumber(int inputArray[]) {
        MyResult result = new MyResult();

        // complexity of sort is O(n) is nlog(n)
        Arrays.sort(inputArray);

        result.secondSmallest = inputArray[1];
        result.secondLargest = inputArray[inputArray.length-2];
        
        return result;
    }

    public static void main(String args[]) {
        int intArray[] = { 88, 100, 4, 8, 7, 1, 28, 99, 16 };

        MyResult result = findSecondSmallestAndSecondLargestNumber2(intArray);
        System.out.println("Second smallest is: " + result.secondSmallest);
        System.out.println("Second largest is: " + result.secondLargest);
    }
    
}
