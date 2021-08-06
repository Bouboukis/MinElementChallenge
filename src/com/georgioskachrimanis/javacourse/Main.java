package com.georgioskachrimanis.javacourse;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please give me the size of the elements Array: \r");
        int arrayLength = MinimumElementChallenge.readInteger();
        System.out.println("Now you will have to provide me " + arrayLength + " integers.");
        int[] usersArray = MinimumElementChallenge.readElements(arrayLength);
        System.out.println("The minimum element of the array is: " + MinimumElementChallenge.findMin(usersArray));

    }

}
