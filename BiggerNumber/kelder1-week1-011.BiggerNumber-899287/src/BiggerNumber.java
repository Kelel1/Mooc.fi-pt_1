
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number:");
        int numb = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number:");
        int numbtwo = Integer.parseInt(reader.nextLine());
        System.out.println("The bigger number of the two numbers given was: " + Math.max(numb, numbtwo));
// Implement your program here. Remember to ask the input from user
    }
               
}
