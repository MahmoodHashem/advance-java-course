package week01.homework; 

public class Book {
    
    private String title; 
    private String author; 
    private String ibsn;
    private boolean isAvailable;


    public Book(String title, String author, String ibsn) {
        this.title = title;
        this.author = author;
        this.ibsn = ibsn;
        this.isAvailable = true; 
    }


    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
        } else {
            System.out.println("Book is not available for borrowing.");
        }
    }

    public void returnBook() {
        isAvailable = true;
    }




    public String getDetails(){
        return "Book: " + " " + title + " \n" + "Author: " + author + " \n" + "IBSN: " + ibsn + " \n" + (isAvailable ? "The book is available" : "The book is not available"); 
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void setIbsn(String ibsn) {
        this.ibsn = ibsn;
    }

    public String getAuthor() {
        return author;
    }

    public String getIbsn() {
        return ibsn;
    }
    public String getTitle() {
        return title;
    }
}
