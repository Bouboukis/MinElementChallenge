package com.georgioskachrimanis.javacourse;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {

    public static Scanner scanner = new Scanner(System.in);

    public static int readInteger() {

        int inputValue = 0;
        inputValue = scanner.nextInt();
        scanner.nextLine();
        return inputValue;
    }

    public static int[] readElements(int count) {

        int[] integersArray = new int[count];
        System.out.println("Please enter " + count + " integers.\r");

        for (int i = 0; i <integersArray.length ; i++) {
            System.out.println("Enter a number: ");
            integersArray[i] = readInteger();
        }

        return integersArray;
    }

    public static int findMin(int[] array) {
        // this is slow
        int [] sortedArray= Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
        return  sortedArray[0];

        // this is better.
//        int minNumber = Integer.MAX_VALUE;
//        for (int i = 0; i <array.length ; i++) {
//            if (array[i] < minNumber){
//                minNumber = array[i];
//            }
//            return minNumber;
//        }
    }

}
