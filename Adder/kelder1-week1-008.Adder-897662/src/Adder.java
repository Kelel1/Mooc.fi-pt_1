
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number:");
        
        int number = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type another number:");
        
        int numberTwo = Integer.parseInt(reader.nextLine());
        
        String results = "Sum of the numbers: " + (number + numberTwo);
        System.out.println(results);// Implement your program here. Remember to ask the input from user
    }
}
