public class Printing {

    public static void printStars(int amount) {
        //System.out.println("\n");
        //System.out.println("");
        int k = 0;  
        while (amount > k) {
            k++;
            System.out.print("*");
            
                          
            
        
            
            
            
        
            // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times        
    }
     System.out.println("");  
    }

    public static void printSquare(int sideSize) {
        int i = 0;
        while (i < sideSize) {            
            printStars(sideSize);
            i++;
        }
            // 39.2
    }

    public static void printRectangle(int width, int height) {                 
                    
            int i = 0;
            while (i < height) {               
               printStars(width);
               i++;
            }       
        
        } // 39.3
    

    public static void printTriangle(int size) {
        int k = size-1;
        while (k >= 0) {            
            printStars(size - k);
            k--;
            
        }
        
// 39.4
    }

    public static void main(String[] args) {
        // Tests do not use main, you can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        
        printStars(3);        
        printStars(5);        
        printStars(7);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(6);
        System.out.println("\n---");
    }

}
