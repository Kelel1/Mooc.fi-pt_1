
public class BoundedCounter {   
    private int value;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit) {       
        this.value = 0;
        this.upperLimit = upperLimit;
        
    }
    
    public void next() {
       this.value++;
       if (value > upperLimit) {
           value = 0;          
       } 
           
    }
    
    public String toString() {
        if (value < 10) {
            return "0" + value ;
        } else {
            return "" + value;
        }
    
    }
    
    public int getValue() {         
        return this.value;
      }
    
    public void setValue(int newValue) {        
            if (newValue >= 0 && newValue <= upperLimit )
                this.value = newValue;
        }
        
    
      
      

      
     
          
          
        // copy here the class BoundedCounter from last weeks assignment 78 
}
