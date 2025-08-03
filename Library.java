import java.util.ArrayList;
import java.util.Scanner;

public class Library{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Ask user what activity they would like to perform
        System.out.println("Welcome to Library Tracker!");
        System.out.println("What would you like to do? Type in the option number!");
        System.out.println("1. Add a book");
        System.out.println("2. View all books");
        System.out.println("3. Check out a book");
        System.out.println("4. Return a book");

        int optionChosen = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Book> booklist = new ArrayList<>();

        if (optionChosen == 1){
            System.out.println("Enter title: ");
            String name = scanner.nextLine();
            System.out.println ("Enter Author: ");
            String author = scanner.nextLine();
            System.out.println("Enter Year Published: ");
            int year = scanner.nextInt();
            scanner.nextLine();
            
            Book book = new Book(name, author, year);
            booklist.add(book);
            System.out.println("Book added!");
            } else if (optionChosen == 2){
                System.out.println(booklist);
            } else if (optionChosen == 3){
                System.out.println("Enter book Title: ");
                String title = scanner.nextLine();
                for (Book book : booklist){
                    if(book.getBookTitle().equalsIgnoreCase(title) && !book.getIsCheckedOut()){
                        book.checkOut();
                        System.out.println("✅ You checked out: " + title + " by " +  book.getAuthor());
                        return;
            } } } else if (optionChosen == 4){
                 System.out.println("Enter book title: ");
                String returnTitle = scanner.nextLine();
                 for(Book newBook: booklist){
                    if(newBook.getBookTitle().equalsIgnoreCase(returnTitle) && newBook.getIsCheckedOut()){
                    newBook.returnBook();
                    System.out.println("Book returned: " + returnTitle + " by " + newBook.getAuthor());
                    return;
                    }

                System.out.println("Cannot find book title or book has not been checked out!");
                     }        
                  }                                       
    }
}