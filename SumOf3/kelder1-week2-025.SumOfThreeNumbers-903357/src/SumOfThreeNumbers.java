
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user in this variable


        System.out.println("Type your first number: ");
        int first = Integer.parseInt(reader.nextLine());
        sum = sum + first;        
         
        System.out.println("Type your second number: ");
        int second = Integer.parseInt(reader.nextLine());
        sum = sum + second;                
        
        System.out.println("Type your third number: ");
        int third = Integer.parseInt(reader.nextLine());
        sum  = sum + third;
        // Write your program here
        
        // Use only variables sum and read

        System.out.println("Sum: " + sum);
    }
}
