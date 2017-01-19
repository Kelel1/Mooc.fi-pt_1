import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int x = 0;
        while (x < name.length()) {       
        x+=1;
        char rev = name.charAt(name.length()-x);
        
        System.out.print(rev);
    
        }
    }
}
