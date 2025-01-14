package com.example.project;

//The IdGenerate class is responsible for generating unique IDs for users or other entities.

public class IdGenerate {

    // Static variable holding the current ID (starting from 99).
    private static int num = 99;

    // Static variable to store the current ID as a String.
    private static String currentId;

    //Constructor initializes the currentId to "99" when the class is first used.
     
    public IdGenerate() {
        currentId = "" + num;
    }

    //return the current ID as a string.
    public static String getCurrentId() {
        return currentId;
    }

    // Resets the current ID back to "99".
     
    public static void reset() {
        num = 99;
        currentId = "" + num;
    }

    // Generates a new ID by incrementing the current ID and returning it as a string.
     
    public static String generateID() {
        num++; // Increment the number
        currentId = "" + num; // Update currentId with the new number
        return currentId;
    }
}
