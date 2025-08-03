public class Book {

    private String bookName;
    private String author;
    private int yearPublished;
    private boolean isCheckedOut;

    public Book(String bookName, String author, int yearPublished){
        this.bookName = bookName;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isCheckedOut = false;
    }

    public String getBookTitle(){
        return bookName;
    }

    public String getAuthor(){
        return author;
    }

    public int getYearPublished(){
        return yearPublished;
    }

    public boolean getIsCheckedOut(){
        return isCheckedOut;
    }
    
    public void checkOut(){
        isCheckedOut = true;
    }

    public void returnBook(){
        isCheckedOut = false;
    }

    public String toString(){
        return "Title: " + bookName + " Author: " + author;
    }
}

    
