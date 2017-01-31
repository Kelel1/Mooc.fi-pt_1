import java.util.Random;

public class Dice {
    private Random random = new Random();
    private int numberOfSides;

    public Dice(int numberOfSides) {
       this.numberOfSides = numberOfSides; 
       
       // Initialize here the number of sides
    }

    public int roll() {        
        int rand = 1;       
        while (rand <=numberOfSides-1) {
            rand++;
           
        }
        return random.nextInt(rand)+1;
            
    }
}
        
    

        
            
         // create here a random number belongig to range 1-numberOfSided
        
    
    
    
