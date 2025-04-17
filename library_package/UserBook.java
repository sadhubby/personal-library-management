package library_package;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class UserBook{
    private Book book;
    private String notes;
    private List<String> tags;
    private LocalDate dateAdded;
    private int rating;

    public UserBook(Book book){
        this.book = book;
        this.dateAdded = LocalDate.now();
        this.tags = new ArrayList<>();
    }

    public Book getBook(){
        return book;
    }

    public void setBook(Book acquireBook){
        this.book = acquireBook;
    }

    public String getNotes(){
        return notes;
    }

    public void setNotes(String acquireNotes){
        this.notes = acquireNotes;
    }

    public List<String> getTags(){
        return tags;
    }

    public void setTags(List<String> acquireTags){
        this.tags = acquireTags;
    }

    public void addTags(String addTag){
        this.tags.add(addTag);
    }

    public LocalDate getDateAdded(){
        return dateAdded;
    }

    public void setDateAdded(LocalDate acquireDateAdded){
        this.dateAdded = acquireDateAdded;
    }

    public int getRating(){
        return rating;
    }

    public void setRating(int acquireRating){
        this.rating = acquireRating;
    }




}
