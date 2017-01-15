
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Until what? ");
        int inp = Integer.parseInt(reader.nextLine());
        int i = 1;
        int re = 0;
        while (i <= inp) {           
            re += inp - i; 
            i++;
            System.out.println(inp + re);
        }

    }
}
