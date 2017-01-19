
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        while (true) {
            System.out.println("Type a word: ");
            String word = reader.nextLine();


            if (word.isEmpty()) {
                System.out.println("You typed the following words: ");
                Collections.sort(words);
                for (String wordz:words) {
                    System.out.println(wordz);
                }
                break;
            }
            words.add(word);
        }// create here an ArrayList
    }
}
