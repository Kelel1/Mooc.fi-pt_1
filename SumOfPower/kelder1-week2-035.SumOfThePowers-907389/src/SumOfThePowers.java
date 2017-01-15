
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int powr = Integer.parseInt(reader.nextLine());
        int result = (int)Math.pow(2,powr);        
        int pewr = powr-1;  
        
        while (pewr >= 0) {
            result += (int)Math.pow(2,pewr);
            pewr--;
            
            //System.out.println(result);
        }       
        System.out.println(result);
    }
}
        
        
       