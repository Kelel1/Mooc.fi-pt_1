import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics sumeven = new NumberStatistics();
        NumberStatistics sumodd = new NumberStatistics();
        
        
        System.out.println("Type numbers: ");       
       
        
        while(true) { 
            int numb = Integer.parseInt(reader.nextLine());           
            if (numb ==-1) {
                break;
            }
            stats.addNumber(numb);
            
            if (numb%2==0) {                  
                    sumeven.addNumber(numb);
                
            }else {                  
                    sumodd.addNumber(numb);
                    
        
                }
         
            
                        
           
            
            
            
            
           
            }
            int ans = stats.sum();
            int ans2 = sumeven.sum();                 
            int ans3 = sumodd.sum(); 
            
                
            System.out.println("sum: " + (ans));           
            System.out.println("sum of even: " + (ans2));            
            System.out.println("sum of odd: " + (ans3));
        }
    
}
    


    



                          
                
            
        
    
            
        
                   
    
            
           
    
     
// Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.

        // The tests does not work if you do not create the objects in the correct order

    


