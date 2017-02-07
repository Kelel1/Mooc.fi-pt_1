
import java.util.ArrayList;
import java.util.Scanner;




public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
   
    ArrayList<Birdz> birdL = new ArrayList<Birdz>();
    
    Scanner reader = new Scanner(System.in);       
    while(true){
        System.out.println("? ");
        String read = reader.nextLine();
        //Birdz birds = new Birdz();  
        //birdL.add(birds);
        
        if(read.equals("Add")){
            System.out.println("Name: ");
            String names = reader.nextLine();
            Birdz birds = new Birdz();
            birds.setName(names);          
            
                  
            System.out.println("Latin Name: ");
            String latnNames = reader.nextLine();
            birds.setLatName(latnNames);
            birdL.add(birds);
        
            
            //System.out.println(birds);
        }
        else if(read.equals("Observation")){
            System.out.println("What was observed:? ");
            String observings = reader.nextLine();
                for(Birdz birdie : birdL){
                    if(!(birdie.getName().equals(observings))){
                    System.out.println("Is not a bird! ");                    
                    }else{
                        birdie.setObservations();
                    }
       
                
            }
        }       
        if(read.equals("Statistics")){       
            for(Birdz birdie : birdL){
                System.out.println(birdie); 
            }
         
        }
        if(read.equals("Show")){
            System.out.println("What");
            String what = reader.nextLine();
            for(Birdz birdie : birdL){
                if(birdie.getName().equals(what)){
                    System.out.println(birdie);
                }else{
                            System.out.println("nop");
                            }
            }
        }        
        if(read.equals("Quit")){
            break;
        }
            
        }
        
        
       
    }

    }

     
    



