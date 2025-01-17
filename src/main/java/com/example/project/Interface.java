package com.example.project;

import java.util.Scanner;
public class Interface
{  // Constructor: Initializes the Interface object with a given BookStore instance.
    public Interface(BookStore bookStore) {
        this.bookStore = bookStore;
    }

    // The number variable stores the user's input for menu selection.
    private int number = -1;
    // Scanner object to read user input from the console.
    Scanner scan = new Scanner(System.in); 
    // Reference to the BookStore object.
    private BookStore bookStore;
    // Main method that runs the command-line interface and handles user input.
    public void run ()
    {
    while (number != 0)
    {
        // Display the main menu options to the user.
        System.out.println("****** WELCOME COME TO THE USSR LIBRARY!******");
        System.out.println("Select From The Following Options:");
        System.out.println("Press 0 to Exit Application.");
        System.out.println("Press 1 to Add new Book.");
        System.out.println("Press 2 to Upgrade Quantity of a Book.");
        System.out.println("Press 3 to Search a Book.");
        System.out.println("Press 4 to Show All Books.");
        System.out.println("Press 5 to Register Student.");
        System.out.println("Press 6 to join the people's republic of china");
        // Get user input for the menu option.
        number = scan.nextInt();
        scan.nextLine();// Consume newline character after integer input.
        // Option 0: Exit the application.
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
        // Option 1: Add a new book to the bookstore.
        else if (number == 1)
        {
            // Prompt user for book details.
            Book [] book = bookStore.getBooks();
            System.out.println("Enter title:");
            String title = scan.nextLine();
            System.out.println("Enter author:");
            String author = scan.nextLine();
            System.out.println("Enter year published:");
            int yearPublished = scan.nextInt();
            System.out.println("Enter isbn:");
            scan.nextLine();        // Consume leftover newline from nextInt.
            String isbn = scan.nextLine();
            System.out.println("Enter quantity:");
            int quantity = scan.nextInt();
            // Create a new Book object and add it to the bookstore.
            Book bk = new Book (title, author, yearPublished, isbn, quantity);
            bookStore.addBook(bk);
            System.out.println("Add successfully!");

        }
        // Option 2: Upgrade the quantity of an existing book.
        else if (number == 2)
        {
            // Prompt user for the title of the book to upgrade.
            Book [] book = bookStore.getBooks();
            System.out.println("Enter title of the book you want to upgrade:");
            String title = scan.nextLine();
             // Find the book and update its quantity.
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
            // If the book doesn't exist, notify the user.
            System.out.println("womp womp the book doesn't exist lol");
            
        }
        // Option 3: Search for a book by title, author, or ISBN.
        else if (number == 3)
        {
            Book [] book = bookStore.getBooks();
            // Prompt user for a search term (title, author, or ISBN).
            System.out.println("Enter the title, author, or ISBN of the book you want to search for:");
            String searchTerm = scan.nextLine();
            boolean found = false;
            // Search through the books and display information if found.
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
            // If no book is found, notify the user.
            if(found=false)
            {
                System.out.println("womp womp the book doesn't exist lol");
            }
            
        }
         // Option 4: Display all books in the bookstore.
        else if (number == 4)
        {
            // Retrieve all books and display their information.
            Book [] book = bookStore.getBooks();
            for (Book bk : book) {
                if (bk != null) {  // Add a null check before accessing the book object
                    System.out.println(bk.bookInfo());
                
            }}
        }
        // Check for null values before printing.
        else if (number == 5)
        {
            // Prompt user for student details (name and ID).
            System.out.println("What is your name:");
            String name = scan.nextLine();
            System.out.println("What is your ID:");
            String id = scan.nextLine();
            // Create a new User object and add to the bookstore's user list.
            User newUser= new User(name, id);
            bookStore.addUser(newUser);
            System.out.println("Student registered successfully!");
        }
        // Option 6: Joke option for joining the "People's Republic of China".
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