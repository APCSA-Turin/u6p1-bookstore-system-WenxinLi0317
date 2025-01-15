package com.example.project;
public class Main
{
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
    
        // Initialize the Interface class, passing in the BookStore object
        Interface interfaceObj = new Interface(bookStore);
        
        // Run the menu interface
        interfaceObj.run();
        
    }
}