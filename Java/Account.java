package Java;

public class Account {
    Integer id;
    public String name;
    String document;
    String email;
    String password;
    Boolean verified;

    public Account(String name, String document, String email, String password, Boolean verified){
        this.name = name;
        this.document = document;
        this.email = email;
        this.password = password;
        this.verified = verified;
    }

    public void printAccount(){
        System.out.println("Name: " + name + " Document: " + document + " Email: " + email + " Verified: " + verified);
    }
}
