import java.util.*;
import library_package.*;

public class Main{
public static void main(String[] args){
    
    MainFrame myFrame = new MainFrame();
    myFrame.initialize();

    try (Scanner sc = new Scanner(System.in)) {
        List<Book> library = new ArrayList<>();       
        
        for(int i = 0; i <= 5; i++){ //for loop for testing
            System.out.println("Enter book name:");
            String bookName = sc.nextLine();
            
            System.out.println("Enter author:");
            String bookAuthor = sc.nextLine();
            
            System.out.println("Enter number of pages:");
            int noOfPages = sc.nextInt();
            

            sc.nextLine();
            
            Book book = new Book();
            book.setBookName(bookName);
            book.setAuthor(bookAuthor);
            book.setNoOfPages(noOfPages);
            
            
            System.out.println("\nBook Details:");
            System.out.println(book.getBookName() + " by: " + book.getAuthor() + "\nPage Counter: " + book.getNoOfPages());
            
            library.add(book);
            
        }
        System.out.println("\nLibrary contains the following books:");
        for (Book b : library) {
            System.out.println(b.getBookName() + " by " + b.getAuthor());

        }
    }
    }
}