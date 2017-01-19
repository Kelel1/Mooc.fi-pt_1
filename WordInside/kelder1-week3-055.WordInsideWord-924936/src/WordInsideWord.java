
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first word: ");
        String firword = reader.nextLine();
        System.out.print("Type the second word: ");
        String secword = reader.nextLine();
        int index = firword.indexOf(secword);
        if (index == -1) {
            System.out.println("The word " + "'"+secword+"' " + "is not found in the word " + "'"+firword+"'.");
        } else {
            System.out.println("The word " + "'" +secword+"' " + "is found in the word " + "'" + firword + "'.");
            
        }
        
        
        
        
        
        
        
    }
}
