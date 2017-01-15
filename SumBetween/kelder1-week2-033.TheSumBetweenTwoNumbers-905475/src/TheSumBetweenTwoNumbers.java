
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int fi = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int la = Integer.parseInt(reader.nextLine());
        //int i = 0;
        int tot = fi+1;
        while (tot <= la) {
            fi += tot;
            tot++;
        }
        System.out.println("The sum is " + fi);
                
        
    }
}
