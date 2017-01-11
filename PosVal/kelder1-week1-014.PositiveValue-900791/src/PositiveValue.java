
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number:");
        int numb = Integer.parseInt(reader.nextLine());
        if (numb > 0) {
            System.out.println("The number is positive");// Type your program here:
        } else {
            System.out.println("The number is not positive");
        }
    }
}
