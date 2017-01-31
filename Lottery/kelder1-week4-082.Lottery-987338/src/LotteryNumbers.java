import java.util.ArrayList;
import java.util.Random;


public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryNumbers() {
        this.numbers = new ArrayList<Integer>();
        // Draw numbers as LotteryNumbers is created
        this.random = new Random();
        this.drawNumbers();
        
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        
         
        
        int i = 0;
        int number = 0;
        
        containsNumber(i);
        numbers.clear();
        while (i < 7) {
            number = this.random.nextInt(39)+1;
             if (!containsNumber(number)) {
                this.numbers.add(number);
                i++;
            }
             
        }          
            
        }
        
           // Write the number drawing here using the method containsNumber()
    

    public boolean containsNumber(int number) {              
               
                while (numbers.contains(number)){ 
                    return true;
                              
            
                }
            
                
        return false;
                
            
    }
            
        
    }
           // Test here if the number is already in the drawn numbers
        
    
    
       

