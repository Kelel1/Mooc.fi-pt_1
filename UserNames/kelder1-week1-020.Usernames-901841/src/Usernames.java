
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your username: ");
        String usrnm = reader.nextLine();
        System.out.println("Type your password: ");
        String paswrd = reader.nextLine();
        if (usrnm.equals("alex") && paswrd.equals("mightyducks")) {
            System.out.println("You are now logged into the system!");
            
        } else if (usrnm.equals("emily")  && paswrd.equals("cat")) {
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your username or password was invalid!");
        }
        

    }
}