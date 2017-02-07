import java.util.ArrayList;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kern Elder
 */
public class Grades {
    private ArrayList<Integer> grades;
    private int failed;
    private int one;
    private int two;
    private int three;
    private int four;
    private int five;
    
public Grades(){
    this.grades = new ArrayList<Integer>();
    this.failed = 0;
    this.one = 0;
    this.two = 0;
    this.three = 0;
    this.four = 0;
    this.five = 0;
    
}
// Prompt user to enter grades
public void addGrade(){
    
    Scanner lukija = new Scanner(System.in);
    
    System.out.print("Type exam scores, -1 completes: ");
        while (true){            
            int read = Integer.parseInt(lukija.nextLine());
            if(read < 0){
                break;           
            }else if((read > -1) && (read < 61)){
                grades.add(read);
            }        
    }       
}

// collect grade distribution 
public void gradeDistro(){
    for(int grade : grades){
        if(grade >= 0 && grade <= 29){
            this.failed += 1;
        }
        else if(grade > 29 && grade <= 34){
            this.one += 1;
        }
        else if(grade > 34 && grade <= 39){
            this.two += 1;
        }
        else if(grade > 39 && grade <= 44){
            this.three += 1;
        }
        else if(grade > 44 && grade <= 49){
            this.four += 1;
        }
        else if(grade > 49 && grade <= 60){
            this.five += 1;
        }
        
    }
        
}
// print grade ditrobution
public void printGrades(){
    System.out.println("Grade distribution: ");
    int i = 5;
    while(i > -1){
        System.out.print(i + ": ");    
        if(i == 5){
            for(int j = 0; j < this.five; j++){
                System.out.print("*" );                
            }
            System.out.print("\n");
        }
        else if(i == 4){
            for(int j = 0; j < this.four; j++){
                System.out.print("*" );                
            }
            System.out.print("\n");
        }
        else if(i == 3){
            for(int j = 0; j < this.three; j++){
                System.out.print("*" );                
            }
            System.out.print("\n");
        }
        else if(i == 2){
            for(int j = 0; j < this.two; j++){
                System.out.print("*" );                
            }
            System.out.print("\n");
        }
        else if(i == 1){
            for(int j = 0; j < this.one; j++){
                System.out.print("*" );                
            }
            System.out.print("\n");
        }
        else if(i == 0){
            for(int j = 0; j < this.failed; j++){
                System.out.print("*" );                
            }
            System.out.print("\n");
        }
        i--;    
    }    
    
}

// prints acceptance percentage
public void acceptance(){
    float pass = 0;
    float allScores = 0;
    float total = 0;
    
    for(int scores : grades){
        allScores += 1;
        if(scores > 29){
            pass += 1;
            
        }
        total = 100*(pass/allScores);
    }
    System.out.print("Acceptance percentage: " + total +"\n");
    System.out.print("All " + allScores + "\n");
    System.out.print("pass " + pass + "\n");
}

}

    

    

