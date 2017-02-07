import java.util.Arrays;
public class Main {
    
    public static int smallest(int[] array) {
    // return the smallest element in an array   
    int small = array[0];    
    for(int i = 1; i < array.length; i++){
        if(array[i] < small){
            small = array[i];           
        }
        
    }
    return small;
    }
    public static int indexOfTheSmallest(int[] array){
     // return the index of the smallest element in an array
    int small = array[0]; 
    int index = 0;
    for(int i = 1; i < array.length; i++){        
        if(array[i] < small){            
            small = array[i];
            index = i;           
        }        
    }
    return index;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        int small = array[index];        
        int index2 = index;
        for(int i = index + 1; i < array.length; i++){        
            if(array[i] < small){            
                small = array[i];                 
                index2 = i;               
            }      
        }        
        return index2;
    }
    
    public static void swap(int[] array, int index1, int index2) {
     int temp = 0;
     temp = array[index1];
     array[index1] = array[index2];
     array[index2] = temp;
    }
    
    public static void sort(int[] array){
       for(int i = 0; i < array.length; i++){
           int toSwap = indexOfTheSmallestStartingFrom(array, i);           
           swap(array, i, toSwap);
           System.out.println(Arrays.toString(array));
           }
       } 
    
    
    public static void main(String[] args) {
        // write testcode here
       int[] values = {8, 3, 7, 9, 1, 2, 4};
       sort(values);
  
    }

}




