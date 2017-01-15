import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());
        //int i = 1;
        int tre = num - 1;
        while (tre > 0) {
            num *= tre;
            tre--;
        
        
        
            
        }
        System.out.println("Factorial is " + num);
                
                
                
                }
        

    }
