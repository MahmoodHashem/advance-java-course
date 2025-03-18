
package week01;



import week01.homework.Book;
import week01.homework.Library;
import week01.homework.Member;

public class Main {

    public static void main(String[] args) {

        Library lib = new Library();


        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1925"); 
        Book book2 = new Book("java", "mahmood", "23"); 

       
        Member m1 = new Member("mahmood", "1"); 

        lib.addBook(book1);
        lib.addBook(book2);

        lib.registerMember(m1);

        m1.borrowBook(book2);
        
    
        

      System.out.println(lib.getLibraryInfo()); 
      System.out.println(lib.findBookByTitle("java"));


    }

}
