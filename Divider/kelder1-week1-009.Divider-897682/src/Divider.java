
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number:");
        double number = Integer.parseInt(reader.nextLine());
        System.out.print("Type another nubmer:");
        double numberTwo = Integer.parseInt(reader.nextLine());
        double results = number / numberTwo;
        System.out.println("Division: " + number + "/" + numberTwo + " = " + results);
        // Implement your program here. Remember to ask the input from user.
                
    }
}
