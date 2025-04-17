package library_package;
import java.util.ArrayList;
import java.util.List;

public class User extends Account{
    private List<UserBook> personalLibrary;

    public User(String username, String email, String password){
        super(username, email, password);
        this.personalLibrary = new ArrayList<>();
    }

    public List<UserBook> getPersonalLibrary(){
        return personalLibrary;
    }

    public void setPersonalLibrary(List<UserBook> acquirePersonalLibrary){
        this.personalLibrary = acquirePersonalLibrary;
    }

    public void addBook(Book book){
        UserBook userBook = new UserBook(book);
        personalLibrary.add(userBook);
    }

    public void removeBook(UserBook userBook){
        personalLibrary.remove(userBook);
    }

    public List<UserBook> viewLibrary(){
        return personalLibrary;
    }

    public UserBook findBookBytTitle(String title){
        for (UserBook userBook : personalLibrary){
            if(userBook.getBook().getBookName().equalsIgnoreCase(title)){
                return userBook;
            }
        }
        return null;
    }

}
