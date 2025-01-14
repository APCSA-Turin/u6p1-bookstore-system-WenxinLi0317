package com.example.project;

// The User class represents a user of the book store system.
 //Each user has a name, an ID, and a list of books they own (up to 5).
 
public class User {

    // User attributes: name, ID, and a list of books.
    private String name;
    private String Id;
    private Book[] book = new Book[5]; // A list of up to 5 books the user owns.

    //Constructor initializes a user with a name and ID.
     
    public User(String name, String Id) {
        this.name = name;
        this.Id = Id;
    }

    //return the name of the user.
     
    public String getName() {
        return name;
    }

    //Sets the user's name.
    public void setName(String name) {
        this.name = name;
    }

    //return The user's ID.
     
    public String getId() {
        return Id;
    }

    //Sets the user's ID.
    
    public void setId(String Id) {
        this.Id = Id;
    }

    //return The user's book array.
     
    public Book[] getBook() {
        return book;
    }

    //Sets the list of books owned by the user.
    
    public void setBooks(Book[] book) {
        this.book = book;
    }

    /*
     Returns a string representation of the user's book list.
     If no books are owned, it will indicate that the list is empty.
     return a formatted string showing the user's books.
     */
    public String bookListInfo() {
        String str = "Books: \n";
        for (Book book : book) {
            if (book == null) {
                str += "empty\n";
            } else {
                str += book.bookInfo() + "\n";
            }
        }
        return str;
    }

    /*
     Returns a detailed string representation of the user's information, including name, ID, and book list.
     return the user's complete information.
     */
    public String userInfo() {
        String str = "";
        str += "Name: " + name + "\nId: " + Id + "\n";
        str += bookListInfo();
        return str;
    }
}
