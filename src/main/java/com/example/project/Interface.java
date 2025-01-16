package com.example.project;

import java.util.Scanner;
public class Interface
{
    public Interface(BookStore bookStore) {
        this.bookStore = bookStore;
    }
    private int number = -1;
    Scanner scan = new Scanner(System.in); 
    private static int index = 0;
    private static int index2 = 0;
    private BookStore bookStore;
    public void run ()
    {
    while (number != 0)
    {
        System.out.println("****** WELCOME COME TO THE USSR LIBRARY!******");
        System.out.println("Select From The Following Options:");
        System.out.println("Press 0 to Exit Application.");
        System.out.println("Press 1 to Add new Book.");
        System.out.println("Press 2 to Upgrade Quantity of a Book.");
        System.out.println("Press 3 to Search a Book.");
        System.out.println("Press 4 to Show All Books.");
        System.out.println("Press 5 to Register Student.");
        System.out.println("Press 6 to join the people's republic of china");
        number = scan.nextInt();
        scan.nextLine();
        if(number==0)
        {
            System.out.println("Thanks for visiting USSR!!!");
            System.out.println("⡿⠄⢀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⠞⠛⠁⠄⡼⣿⣿\n" + //
                                "⣿⡇⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠙⣦⠐⠠⡥⣿⣿\n" + //
                                "⣿⡇⠄⣿⡿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣿⡔⠛⣿⣿\n" + //
                                "⣿⡇⢰⢏⣤⣦⣤⣍⣉⣿⣿⣿⡟⢋⣁⣤⣤⣤⣈⢻⣿⣿⣿⣿⠚⣯⡄⣿⣿\n" + //
                                "⣿⡇⣾⣿⣉⣀⣠⠅⠄⣽⣿⣿⣇⠈⢈⣉⣩⣐⡙⢿⣿⣿⣿⣿⠤⢿⢱⣿⣿\n" + //
                                "⣿⠁⣿⣿⣿⣿⣿⣦⣾⣿⣿⣿⣿⣷⣤⣽⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⠾⣿⣿\n" + //
                                "⡏⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⡇⣿⣿\n" + //
                                "⣧⢾⣿⣿⣿⣿⣿⣾⣯⣽⣋⠽⢭⣽⣤⡘⢿⣿⣿⣿⣿⣿⣿⣿⣿⠄⣿⣿⣿\n" + //
                                "⣿⣿⣿⣿⣿⣿⠿⠩⣭⣽⠁⢣⢿⣯⡉⣿⡶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" + //
                                "⣿⣿⣿⣿⠿⠁⠄⠈⠋⠈⠄⡈⠁⠒⠌⠊⣃⠹⣿⣿⣿⣿⣿⣏⣻⣿⣿⣿⣿\n" + //
                                "⣿⣿⣿⣷⣶⣤⣤⣶⣿⣿⣿⡿⣿⣷⣤⣄⣤⣠⣼⣿⣿⣿⣿⡟⣿⣿⣿⣿⣿\n" + //
                                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡁⠸⣿⣿⣿⣿\n" + //
                                "⣿⣿⡿⠉⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⣷⣿⣿⣿⣿⣿\n" + //
                                "⡿⠛⠄⠄⠄⠙⢿⣷⣿⣭⣤⣬⡁⢉⣻⣿⣿⣿⣿⣿⣿⡟⠄⠹⣿⣿⣿⣿⣿");
            break;
        }
        else if (number == 1)
        {
            Book [] book = bookStore.getBooks();
            System.out.println("Enter title:");
            String title = scan.nextLine();
            System.out.println("Enter author:");
            String author = scan.nextLine();
            System.out.println("Enter year published:");
            int yearPublished = scan.nextInt();
            System.out.println("Enter isbn:");
            String isbn = scan.nextLine();
            System.out.println("Enter quantity:");
            int quantity = scan.nextInt();
            Book bk = new Book (title, author, yearPublished, isbn, quantity);
            bookStore.addBook(bk);
            System.out.println("Add successfully!");

        }
        else if (number == 2)
        {
            Book [] book = bookStore.getBooks();
            System.out.println("Enter title of the book you want to upgrade:");
            String title = scan.nextLine();
            for(int i = 0; i < book.length; i++)
            {
                if(book[i].getTitle().equals(title))
                {
                    System.out.println("Upgrade Quantity:");
                    int num = scan.nextInt();
                    bookStore.getBooks()[i].setQuantity(num);
                    System.out.println("Quantity of \"" + bookStore.getBooks()[i].getTitle() + "\" successfully upgraded to " + bookStore.getBooks()[i].getQuantity());
                    break;
                }
               
            }
            System.out.println("womp womp the book doesn't exist lol");
            
        }
        else if (number == 3)
        {
            Book [] book = bookStore.getBooks();
            System.out.println("Enter the title, author, or ISBN of the book you want to search for:");
            String searchTerm = scan.nextLine();
            boolean found = false;
            for (int i = 0; i < book.length; i++) 
            {
                if (book[i] != null && (book[i].getTitle().equals(searchTerm) || book[i].getAuthor().equals(searchTerm) || book[i].getIsbn().equals(searchTerm))) 
                {
                    System.out.println("Book found:");
                    System.out.println(book[i].bookInfo());  
                    found = true;
                    break;
                }
                
            }
            if(found=false)
            {
                System.out.println("womp womp the book doesn't exist lol");
            }
            
        }
        else if (number == 4)
        {
            Book [] book = bookStore.getBooks();
            for (Book bk : book) {
                if (bk != null) {  // Add a null check before accessing the book object
                    System.out.println(bk.bookInfo());
                
            }}
        }
        else if (number == 5)
        {
            System.out.println("What is your name:");
            String name = scan.nextLine();
            System.out.println("What is your ID:");
            String id = scan.nextLine();
            User newUser= new User(name, id);
            bookStore.addUser(newUser);
            System.out.println("Student registered successfully!");
        }
    
        else
        {
            System.out.println("Thank you for join the People's Republic of China!!!");
            System.out.println("You are converted to a Communist now!!!");
            System.out.println("⣿⣿⣿⣿⣿⠟⠋⠄⠄⠄⠄⠄⠄⠄⢁⠈⢻⢿⣿⣿⣿⣿⣿⣿⣿\n" + //
                                "⣿⣿⣿⣿⣿⠃⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⡀⠭⢿⣿⣿⣿⣿\n" + //
                                "⣿⣿⣿⣿⡟⠄⢀⣾⣿⣿⣿⣷⣶⣿⣷⣶⣶⡆⠄⠄⠄⣿⣿⣿⣿\n" + //
                                "⣿⣿⣿⣿⡇⢀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠄⠄⢸⣿⣿⣿⣿\n" + //
                                "⣿⣿⣿⣿⣇⣼⣿⣿⠿⠶⠙⣿⡟⠡⣴⣿⣽⣿⣧⠄⢸⣿⣿⣿⣿\n" + //
                                "⣿⣿⣿⣿⣿⣾⣿⣿⣟⣭⣾⣿⣷⣶⣶⣴⣶⣿⣿⢄⣿⣿⣿⣿⣿\n" + //
                                "⣿⣿⣿⣿⣿⣿⣿⣿⡟⣩⣿⣿⣿⡏⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" + //
                                "⣿⣿⣿⣿⣿⣿⣹⡋⠘⠷⣦⣀⣠⡶⠁⠈⠁⠄⣿⣿⣿⣿⣿⣿⣿\n" + //
                                "⣿⣿⣿⣿⣿⣿⣍⠃⣴⣶⡔⠒⠄⣠⢀⠄⠄⠄⡨⣿⣿⣿⣿⣿⣿\n" + //
                                "⣿⣿⣿⣿⣿⣿⣿⣦⡘⠿⣷⣿⠿⠟⠃⠄⠄⣠⡇⠈⠻⣿⣿⣿⣿\n" + //
                                "⣿⣿⣿⣿⡿⠟⠋⢁⣷⣠⠄⠄⠄⠄⣀⣠⣾⡟⠄⠄⠄⠄⠉⠙⠻\n" + //
                                "⡿⠟⠋⠁⠄⠄⠄⢸⣿⣿⡯⢓⣴⣾⣿⣿⡟⠄⠄⠄⠄⠄⠄⠄⠄\n" + //
                                "⠄⠄⠄⠄⠄⠄⠄⣿⡟⣷⠄⠹⣿⣿⣿⡿⠁⠄⠄⠄⠄⠄⠄⠄⠄\n" + //
                                "⠄⠄⠄⠄⠄⠄⣸⣿⡷⡇⠄⣴⣾⣿⣿⠃⠄⠄⠄⠄⠄⠄⠄⠄⠄\n" + //
                                "⠄⠄⠄⠄⠄⠄⣿⣿⠃⣦⣄⣿⣿⣿⠇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄\n" + //
                                "⠄⠄⠄⠄⠄⢸⣿⠗⢈⡶⣷⣿⣿⡏⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄");
        }
    }
    
    scan.close();
}
}