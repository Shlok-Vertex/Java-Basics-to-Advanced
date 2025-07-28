

class Account{
    public String name;
    protected String email;
    private String password;


    //getters & setters

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass){
        this.password = pass;
    }
}

public class Bank {
    public static void main(String[] args) {
        System.out.println("-----------Bank Example-----------");

        Account acc1 = new Account();
        acc1.name = "Shlok";
        acc1.email = "shlok@example.com";
        acc1.setPassword("123");
        System.out.println(acc1.getPassword());
        // System.out.println("Account Holder: " + acc1.name);
        // System.out.println("Email: " + acc1.email);
    }
}
