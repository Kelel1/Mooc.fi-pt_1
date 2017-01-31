import java.util.Random;

public class PasswordRandomizer {
    private Random random = new Random();
    private int length;
    
    // Define the variables


    public PasswordRandomizer(int length) {
        this.length = length;        
        this.random = new Random();
        // Initialize the variable
    }       

    public String createPassword() { 
          int a = 0;
        String word = "";        
        
        while (a < length) {
            a++;           
            
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(26));          
           
            word+=symbol;
            
            
            
         // write code that returns a randomized password     
               
        }            
        return word;
        
        
        
    }
   
      
    
}

       
        
              
       
             
       
    

    
    
       
    

   


       
       
    
    
   



        


    

