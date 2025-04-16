// Class used to create class instance of a Book

package library_package;

public class Book {
    
    // Book Attributes
    private String bookName;
    private String author;
    private String bookCoverUrl;
    private int noOfPages;  
    
    // Setters and Getters
    public void setBookName(String acquiredBookName){
        this.bookName = acquiredBookName;
    }

    public String getBookName(){
        return bookName;
    }

    public void setAuthor(String acquiredAuthor){
        this.author = acquiredAuthor;
    }

    public String getAuthor(){
        return author;
    }

    public void setBookCoverUrl(String acquiredBookCoverUrl){
        this.bookCoverUrl = acquiredBookCoverUrl;
    }

    public String getBookCoverUrl(){
        return bookCoverUrl;
    }

    public void setNoOfPages(int acquiredNoOfPages){
        this.noOfPages = acquiredNoOfPages;
    }

    public int getNoOfPages(){
        return noOfPages;
    }

}
