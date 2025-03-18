package week01.homework;

import java.util.ArrayList;
import java.util.List;

public class Member {
    
    private String name; 
    private String memberId; 
    private List<Book> borrowedBooks;


   public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }



    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.borrowBook();
            borrowedBooks.add(book);
            System.out.println(name + " borrowed: " + book.getTitle());
        } else {
            System.out.println("Book is not available for borrowing.");
        }
    }


    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            book.returnBook();
            borrowedBooks.remove(book);
            System.out.println(name + " returned: " + book.getTitle());
        } else {
            System.out.println("This book was not borrowed by you.");
        }
    }



    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setBorrowedBooks(List<Book> borrowBooks) {
        this.borrowedBooks = borrowBooks;
    }


    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }


    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }
    



    
}
