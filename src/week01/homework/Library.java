package week01.homework;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;
    private List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book: " + book.getTitle());
    }

    public void registerMember(Member member) {
        members.add(member);
        System.out.println("Registered member: " + member.getMemberId());
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; // Book not found
    }

    public Member findMemberById(String memberId) {
        for (Member member : members) {
            if (member.getMemberId().equalsIgnoreCase(memberId)) {
                return member;
            }
        }
        return null; // Member not found
    }

    public void borrowBook(String memberId, String title) {
        Member member = findMemberById(memberId);
        Book book = findBookByTitle(title);

        if (member != null && book != null) {
            if (!member.getBorrowedBooks().contains(book)) {
                member.getBorrowedBooks().add(book);
            }
        }
    }

    public void returnBook(String memberId, String title) {

        Member member = findMemberById(memberId);
        Book book = findBookByTitle(title);

        if (member != null && book != null) {
            member.getBorrowedBooks().remove(book);
        }

    }



    public String getLibraryInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Library Information:\n");
        info.append("Total Books: ").append(books.size()).append("\n");
        info.append("Total Members: ").append(members.size()).append("\n");
        info.append("Books:\n");
        for (Book book : books) {
            info.append("- ").append(book.getTitle()).append("\n");
        }
        info.append("Members:\n");
        for (Member member : members) {
            info.append("- ").append(member.getMemberId()).append("\n");
        }
        return info.toString();
    }
}
