package com.example.project;

public class IdGenerate{ //This class contains statics variable and methods, you do not initalize an object to use it.
    
     // //requires 1 private attribute String currentId. You must initialize it to 99
     private static int num = 99;
     private static String currentId ;
     // //requires one empty constructor
     public IdGenerate()
     {
         currentId = "" + num;
     }
 
     // public  getCurrentId(){}
     public static String getCurrentId()
     {
         return currentId;
     }
     // public  reset(){} //must reset the currentId back to 99
     public static void reset()
     {
         num = 99;
         currentId = "" + num;
     }
 
     // public generateID(){} //generates a new id, when called it will increment the currentId by 1.. Hint pay attention to data type of currentId
     public static String generateID()
     {
        num++; // Increment the number
        currentId = "" + num; // Update currentId with the new number
        return currentId;
     }
}