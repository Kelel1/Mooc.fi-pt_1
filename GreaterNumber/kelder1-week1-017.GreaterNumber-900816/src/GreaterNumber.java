import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first number:");
        int firnum = Integer.parseInt(reader.nextLine());
        System.out.println("Type the second number:");
        int secnum = Integer.parseInt(reader.nextLine());
        if (firnum > secnum ) {
            System.out.println("Greater number: " + firnum );
        } else if (secnum > firnum) {
            System.out.println("Greater number: " + secnum );
        } else {
            System.out.println("The numbers are equal!");
        }
        

    }
}

