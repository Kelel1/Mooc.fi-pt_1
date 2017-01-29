import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int k = -1;  
        int li = 0;
        while (k < list.size()-1) { 
        k++;
        li += list.get(k);
         }// Write your code here
        return li;
    
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        // write code here
        return (sum(list)/(double)list.size());
    }

    public static double variance(ArrayList<Integer> list) {
        
        double newNumb = 0;
        double ave = average(list);
        for (Integer numb: list) {
            newNumb += Math.pow(numb - ave,2.0);
        }// write code here
        return (newNumb)/(list.size()-1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(1);
        //list.add(7);
        //list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
