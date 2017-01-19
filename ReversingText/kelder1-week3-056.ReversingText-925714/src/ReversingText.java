
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        String help = "";
        int x = 0;
        while (x < text.length()) {
            x+=1;
            char character = text.charAt(text.length()-x);
            help = help+character;
            
            
        }
       
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        return help;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
