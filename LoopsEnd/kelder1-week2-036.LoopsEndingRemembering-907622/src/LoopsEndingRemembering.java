import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.print("Type numbers: ");
        int num;
        int sum = 0;
        int count = 0;  
        int even = 0;
        int odd = 0;       
        
        while (true) {                 
            num = Integer.parseInt(reader.nextLine());
            if (num > 0){
            sum += num;
            System.out.println(sum);            
            count += 1;   
            
        
        
            } if (num % 2 == 0) {
                even += 1;
            } else if (num % 2 > 0) {
                odd += 1;
            }
                    
            else if (num < 0) {            
            System.out.println("Thank you and see you later! ");              
            System.out.println("The sum is " + (sum));
            System.out.println("How many numbers: " + (count));
            double ave = (double)sum/count;
            System.out.println("Average: " + ave);
            System.out.println("Even numbers: " + even);
            System.out.println("Odd numbers: " + odd);
                    break;
                       
        }
        

        }
        
         

    }
}
