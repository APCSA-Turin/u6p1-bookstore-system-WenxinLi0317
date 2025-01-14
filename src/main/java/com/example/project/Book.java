package com.example.project;
//The Book class represents a book with details such as title, author, year of publication, ISBN, and quantity.
//It provides methods to retrieve and modify these details.
public class Book{
    // Book attributes: title, author, year, ISBN, and quantity.
    private String title;
    private String author;
    private int yearPublished;
    private String isbn;
    private int quantity;

    //Constructor initializes a book with the given details.
    public Book (String title, String author, int yearPublished, String isbn, int quantity)
    {
        this.title=title;
        this.author=author;
        this.yearPublished=yearPublished;
        this.isbn=isbn;
        this.quantity=quantity;
    }

    //return the title of the book
    public String getTitle() 
    {
        return title;
    }

    // set the title of the book
    public void setTitle(String title)
    {
        this.title=title;
    }
    
    //return the author of the book
    public String getAuthor()
    {
        return author;
    }

    // set the author of the book
    public void setAuthor(String author)
    {
        this.author=author;
    }

    // return the year the book is published
    public int getYearPublished()
    {
        return yearPublished;
    }

   // set the year the book is published
    public void setYearPublished(int yearPublished)
    {
        this.yearPublished=yearPublished;
    }

    //return the isbn of the book
    public String getIsbn ()
    {
        return isbn;
    }

      // set the isbn of the book
    public void setIsbn(String isbn) 
    {
        this.isbn=isbn;
    }

    //return the quantity of the book
    public int getQuantity()
     {
        return quantity;
     }

     //set the quantity of the book
    public void setQuantity(int quantity) 
    {
        this.quantity=quantity;
    }

    //Returns a string representation of the book's information.
    //returns "Title: [], Author: [], Year: [], ISBN: [], Quantity: []"
    public String bookInfo()
    {
        String str = "Title: "+title+", Author: "+author+", Year: "+yearPublished+", ISBN: "+isbn+", Quantity: "+quantity;
        return str;
    } 
       
}