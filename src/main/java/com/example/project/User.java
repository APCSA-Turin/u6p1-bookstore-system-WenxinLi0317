package com.example.project;

public class User{
    //requires 3 private attributes String name, String Id, Book book that is initialized to empty
    private String name;
    private String Id;
    private Book[]book = new Book [5];
    //requires 1 contructor with two parameters that will initialize the name and id
    public User (String name, String Id)
    {
        this.name=name;
        this.Id=Id;
    }
    // public  getName() {}

    public String getName()
    {
        return name;
    }
    // public  setName() {}
    public void setName(String name)
    {
        this.name = name;
    }
    // public  getId() {}

    public String getId()
    {
        return Id;
    }
    // public void setId() {}
    public void setId(String Id)
    {
        this.Id=Id;
    }
    // public getBooks() {}
    public Book[] getBook()
    {
        return book;
    }
    // public setBooks() {}
    public void setBooks(Book [] book)
    {
        this.book = book;
    }
    public String bookListInfo()
    {
       
            String str = "Books: \n";
            for (Book book: book)
            {
                if(book == null)
                {
                    str += "empty\n";
                    
                }
                else
                {
                str += book.bookInfo() +"\n";
                }
            }
            return str;
        }
    
     //returns a booklist for the user, if empty, output "empty"

     public String userInfo()
     {
        String str = "";
        str += "Name: "+name+"\nId: "+Id+"\n";
        str += bookListInfo();
        return str;
     } //returns  "Name: []\nID: []\nBooks:\n[]"
       
}