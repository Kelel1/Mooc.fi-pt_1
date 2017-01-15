public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        while (amount > 0) {
            amount--;
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        while (amount > 0) {
            System.out.print(" ");
            amount--;
            
            // 40.1
    }
        
    }

    public static void printTriangle(int size) {
        int k = size-1;        
        while (k >= 0) {
            printWhitespaces(k);
            printStars(size-k);            
            k--;
        
        }        
        // 40.2
    }

    public static void xmasTree(int height) {
        int k = 0; 
        int j = height-1;
        
        while (k < height) {
            printWhitespaces(j);
            printStars (2*k + 1);            
            k++;
            j--;
            
        
        
            
            
        
        
        }
        int l = 3;
        int m = 2;
        while (m > 0) {
            if (height >= 5) {         
        printWhitespaces((2*k + 1)/(3));
        printStars(l);
            } else {
                printWhitespaces((2*k + 1)/(4));
                printStars(l);
            }
                
        m--;
    
    }
    }

    public static void main(String[] args) {   
    
        // Tests do not use main, yo can write code here freely!
    
        printTriangle(4);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
    
    

        