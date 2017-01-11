

import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the radius:");
        int radi = Integer.parseInt(reader.nextLine());
        double circ = (2*Math.PI*radi);
        System.out.println("Circumference of the circle: " + circ);
        
                

        // Program your solution here 
    }
}
