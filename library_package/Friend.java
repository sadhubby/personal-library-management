package library_package;
import java.util.List;

public class Friend extends Account{
    private User friendOf;


    public Friend(String username, String email, String password, User friendOf){
        super(username, email, password);
        this.friendOf = friendOf;

    }
    public User getFriendOf(){
        return friendOf;
    } 

    public void setFriendOf(User acquireUser){
        this.friendOf = acquireUser;
    }

    public List<UserBook> viewFriendLibrary(){
        if(friendOf != null){
            return friendOf.viewLibrary();
        }
        else{
            System.out.println("No friends assigned");
            return null;
        }
    }
    
}
