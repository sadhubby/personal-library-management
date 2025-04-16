import java.util.*;
import library_package.*;
class Main{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter input: ");
    String bookName = sc.nextLine();
    String bookAuthor = sc.nextLine();
    int noOfPages = sc.nextInt();

    sc.close();
    
    Book book = new Book();

    book.setBookName(bookName);
    book.setAuthor(bookAuthor);
    book.setNoOfPages(noOfPages);

    System.out.println(book.getBookName() + " by: " + book.getAuthor() + "\nPage Counter: " + book.getNoOfPages());



}
}