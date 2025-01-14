package com.example.project;

public class BookStore{

    //requires at least 2 attributes Book[] books, User[] users (initialized to an empty array of 10 max users) 
    private Book [] books = new Book[5];
    private User [] users = new User [10];
    private int index = 0;
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
        users[index]=user;
    } 

    public void removeUser(User user)
    {
        String name = user.getName();
        int num = 0;
        for (int i = 0; i < users.length; i++)
        {
            if(users[i].getName()==name)
            {
                users[i]=null;
                num = i;
            }
        }
    }

    // public void consolidateUsers(){}

    // public void addBook(Book book){}

    // public void insertBook(Book book, int index){}

    // public void removeBook(Book book){}
       
    // public String bookStoreBookInfo(){} //you are not tested on this method but use it for debugging purposes

    // public String bookStoreUserInfo(){} //you are not tested on this method but use it for debugging purposes

}