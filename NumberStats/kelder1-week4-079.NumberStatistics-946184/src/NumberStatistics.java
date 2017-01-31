
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;
    
    
    public NumberStatistics() {
        this.amountOfNumbers = 0;   
        this.sum = 0;
    }
    
    public void addNumber(int number) {
        sum += number;
        amountOfNumbers+=1;
             
    }
    
    public int amountOfNumbers() {
        
        return amountOfNumbers;
    }
    
    public int sum() {        
        return sum;
        
            
        }    
    
    public double average() {
        if (amountOfNumbers > 0) {
            return ((double)sum/amountOfNumbers);
        } else {
            return 0/1;
        
    } 
    }
}
    
    
    
