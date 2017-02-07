
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        
        while (true) {
            System.out.print("name: ");
            String name1 = reader.nextLine();           
            if (name1.isEmpty()) {                
                    break;                       
                }
            System.out.print("studentnumber: ");
            String idNumber = reader.nextLine();
             Student students = new Student(name1 ,idNumber);
             list.add(students);
             System.out.println(students);          
            
        }
        System.out.print("Give search term: ");
        
       
        String search = reader.nextLine();
        System.out.println("Result: ");
        for (Student stu : list) {            
            if (stu.getName().contains(search)) {                
                System.out.println(stu.toString());
                   
               }
           }
        
        
        // write here the main program
    }
}