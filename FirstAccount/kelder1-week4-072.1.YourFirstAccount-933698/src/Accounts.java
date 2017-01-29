
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        Account kernsAccount = new Account("Kern's accont", 100.0);
        

        System.out.println("Initial state");
        System.out.println(kernsAccount);
        
        
        kernsAccount.deposit(20);
        System.out.println(kernsAccount);

// write your code here
    }

}
