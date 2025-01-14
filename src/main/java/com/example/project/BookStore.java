package com.example.project;

public class BookStore{

    //requires at least 2 attributes Book[] books, User[] users (initialized to an empty array of 10 max users) 
    private Book [] books = new Book[5];
    private User [] users = new User [10];
    private static int number = 0;
    //requires 1 empty constructor
    public BookStore()
    {

    }
    // public getUsers(){}
    public User[] getUsers()
    {
        return users;
    }
    // public setUsers(){}
    public void setUsers(User[] users)
    {
        this.users=users;
    }

    public Book[] getBooks()
    {
        return books;
    }

    public void addUser(User user)
    {
        users[number]=user;
         number++;
    } 

    public void removeUser(User user)
    {
        String name = user.getName();
        
        for (int i = 0; i < users.length; i++)
        {
            if(users[i] != null && users[i].getName().equals(name))
            {
                users[i]=null;
            }
        }
        User[] newList = new User[users.length];
        int index = 0;
        for (int i = 0; i <users.length; i++)
        {
            if (users[i] != null)
            {
                newList[index] = users[i];
                index++;
            }
        }
        users = newList;
    }

     public void consolidateUsers()
    {
        User[] newList = new User[users.length];
        int index = 0;
        for (int i = 0; i <users.length; i++)
        {
            if (users[i] != null)
            {
                newList[index] = users[i];
                index++;
            }
        }
        users = newList;
    }

    public void addBook(Book book)
    {
        for(int i = 0; i < books.length; i++)
        {
            if(books[i]==null)
            {
                books[i]=book;
                break;
            }
        }
    }

    public void insertBook(Book book, int index)
    {
        if(books[index]==null)
        {
            books[index]=book;
        }
        else 
        {
            
            Book placeholder = books[index];
            books[index]=book;
            books[index+1]=placeholder;
        }
    }

    public void removeBook(Book book)
    {
        String name = book.getTitle();
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getTitle().equals(name)) {
                if (books[i].getQuantity() > 1) {
                    // Decrement the quantity of the book
                    books[i].setQuantity(books[i].getQuantity() - 1);
                } else {
                    // Remove the book if the quantity is 1
                    books[i] = null;
                }
                break; // Exit the loop after removing or decrementing the quantity
            }
        }
        
        for (int i = 0; i < books.length - 1; i++) {
            if (books[i] == null && books[i + 1] != null) {
                books[i] = books[i + 1];
                books[i + 1] = null;
            }
        }
        /*Book [] newList = new Book[books.length-1];
        for(int i = 0; i < books.length; i++)
        {
            newList[i] = books[i];
        }
        books=newList;*/

        
        int index = 0;
        for (int i = 0; i <books.length; i++)
        {
            if (books[i] != null)
            {
                index++;
            }
        }
        Book[] newList = new Book[index];
        for (int i = 0; i < index; i++)
        {
            newList[i] = books[i];
        }
        books = newList;
    }
       
    //public String bookStoreBookInfo(){} //you are not tested on this method but use it for debugging purposes

    // public String bookStoreUserInfo(){} //you are not tested on this method but use it for debugging purposes

}