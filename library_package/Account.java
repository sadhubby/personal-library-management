package library_package;

public class Account {
    // username, password
    // do i login or not here? maybe no because I just want to create blueprint for my objects. 
    private String accountUsername;
    private String accountEmail;
    private String accountPassword;

    //Setters and getters

    public void setAccountUsername (String acquiredAccountUsername){
        this.accountUsername = acquiredAccountUsername;
    }

    public String getAccountUsername(){
        return accountUsername;
    }

    public void setAccountEmail (String acquiredAccountEmail){
        this.accountEmail = acquiredAccountEmail;
    }

    public String getAccountEmail(){
        return accountEmail;
    }

    public void setAccountPassword (String acquiredPassword){
        this.accountPassword = acquiredPassword;
    }

    public String getAccountPassword(){
        return accountPassword;
    }
}
