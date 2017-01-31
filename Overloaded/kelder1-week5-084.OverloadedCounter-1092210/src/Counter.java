/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kern Elder
 */
public class Counter {
    
    
    private int val;
    private boolean check;
    
    public Counter(int startingValue, boolean check) {
        this.val = startingValue;
        this.check = check;
        
    }
    public Counter(int startingValue) {
       this(startingValue,false);
        
    }
    public Counter(boolean check){
       this(0,true);         
        
    }
    
    public Counter() {
        this(0, false);
        }
    
    
     public int value() {      
        return val;
    }    
    
    public void increase() {
       increase(1);
    }
    
    public void decrease() {       
               
            decrease(1);                           
       
    }
    public void increase(int increaseAmount) {        
        if (increaseAmount < 0) {
            val += 0;
            
        } else {
            val += increaseAmount;
        }
        
    }
    public void decrease(int decreaseAmount) {        
        if (decreaseAmount >= 0) {
            val -= decreaseAmount;
        }
        if (decreaseAmount < 0) {
            val += 0;
            
        } if((check) && (val < 0)) {
            val += -(val);            
        }  
        
          
    }
}


   
    


