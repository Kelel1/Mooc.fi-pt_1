
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int num = 0;
        int ch = -1;
        while ((num < name.length()) && (ch < name.length())) {
            num +=1;
            ch +=1;
            System.out.println(num +". character: " + name.charAt(ch));            
            //break;
        
    }
    }
}
