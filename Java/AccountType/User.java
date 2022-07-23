package Java.AccountType;
import Java.Account;

public class User extends Account{
    public User(String name, String document, String email, String password, Boolean verified){
        super(name, document, email, password, verified);
    }
}
