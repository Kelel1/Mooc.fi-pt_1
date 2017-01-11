
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name:");
        String firpername = reader.nextLine();
        System.out.print("Type your age:");
        int firperage = Integer.parseInt(reader.nextLine());
        System.out.print("Type your name:");
        String secpername = reader.nextLine();
        System.out.print("Type your age:");
        int secperage = Integer.parseInt(reader.nextLine());
        System.out.print(firpername + " and " + secpername + " are " + (firperage + secperage) + " years old in total." );
        
        // Implement your program here
    }
}
