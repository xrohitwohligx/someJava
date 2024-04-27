package bank;

class Account{
    public String name; // this is public 

    String name1; // this is default 

    protected String email; // this is protected 

    private String password; // this is private

    //for private we can use getters and setter 
    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass){
        this.password = pass;
    }
}
public class bank {

    public static void main(){
        Account account1 = new Account();
        account1.name = "Rohit tech";
        account1.email = "rohittech@tech.com";
        // account1.password = "rohit@123";  // this cannot be accessed as it from a private class
        account1.setPassword("rohit@123");
        System.out.println(account1.getPassword());
    }
}
