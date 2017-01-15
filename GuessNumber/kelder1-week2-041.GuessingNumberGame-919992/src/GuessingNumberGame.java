
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();     
            
            int guesses = 0;
            while (true) {
                ges();
                guesses+=1;
                int guess = Integer.parseInt(reader.nextLine());
                if (guess == numberDrawn) {
                    System.out.println("Congratulations, your guess is correct!");
                    break;
                }
                
            
            while (guess != numberDrawn) {
                
                if (guess < numberDrawn){
                System.out.println("The number is greater, guesses made: " + guesses);                
                break;
                
                } else if (guess > numberDrawn) {
                    System.out.println("The number is lesser, guesses made: " + guesses);                    
                    break;                   
                } 
           
                    
                
            
    


    
                    
                
            
         // program your solution here. Do not touch the above lines!
        
         
            
                
                
            
        
    
    
            }
            
            }
    }
            
  


    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);    
    }
    public static void ges() {
        System.out.print("Guess a number: ");
    }
}








        
    
        
    
    
        
        
    


