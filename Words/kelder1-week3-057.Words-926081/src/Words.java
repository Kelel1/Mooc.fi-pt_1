import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        while (true) {
        System.out.println("Type a word: ");
        String worde = reader.nextLine(); 
        words.add(worde);
        for (String word: words) {            
        } if (worde.isEmpty()) {
            System.out.println("You typed the following words: ");
            System.out.print(words);
            break;
                    
    }
    
    }
    }
}
