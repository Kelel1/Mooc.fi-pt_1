import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Scanner lukija = new Scanner(System.in);
    Grades Grades = new Grades();
       
    Grades.addGrade();
    
    Grades.gradeDistro();
    
    Grades.printGrades();
    
    Grades.acceptance();
    
    
    
   
}
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        
    }

