
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        // Write code here
        int a = array.length;
        for(int val = 0, n = array.length; val < n - 1; val++) {         
            
            System.out.print(array[val] + ", ");          
         
        }         
        
        
        System.out.println( array[a - 1] + "\n");
}
}
