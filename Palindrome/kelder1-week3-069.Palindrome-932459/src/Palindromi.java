import java.util.Scanner;

public class Palindromi {
    
    
    public static String reverse(String text) {
        String help = "";
        int x = 0;
        while (x < text.length()) {
            x+=1;
            char character = text.charAt(text.length()-x);
            help = help+character;
            
            
        }
        return help;
    }

    public static boolean palindrome(String text) {
        String helpTwo = "";
        int x = 0;
        while (x < text.length()) {
            x+=1;
            char characterTwo = text.charAt(text.length()-1);
            helpTwo = helpTwo+characterTwo;
        } if (text.equals(reverse(text))) {
// write code here
        return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
