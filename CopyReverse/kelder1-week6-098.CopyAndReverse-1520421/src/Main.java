import java.util.Arrays;

public class Main {
    
    public static int[] copy(int[] array){   
        
       int[] copy_1 = new int[array.length]; 
       for(int a = array.length -1; a > -1; a--){
           copy_1[a] = array[a];       
       }   
       return copy_1;
    }   
    
    public static int[] reverseCopy(int[] array){       
        
        
        int[] copy_2 = new int[array.length];                       
            
            
            int x = 0;
            int y = array.length - 1;
             
            
            while(((x < array.length) && (y >= 0))){                
            
            copy_2[x] = array[y];
            
            x++;
            y--;                     
           
            }                
     
        return copy_2;
    }
        
        
        
    
    
              
        

    public static void main(String[] args) {
        
        
        // write testcode here
    //int[] original = {1, 2, 3, 4};
    //int[] copied = copy(original);
    int[] original = {18, 10, 8, 15, 2, 10};
    int[] reverse = reverseCopy(original);

    

    // change the copied
    //copied[0] = 99;
    System.out.println( "original: " +Arrays.toString(original));
    System.out.println( "reversed: " +Arrays.toString(reverse));

    // print both
    //System.out.println( "original: " + Arrays.toString(original));
    //System.out.println( "copied: " + Arrays.toString(copied));
}
     
  
        
    }
    

