import java.util.Random;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kern Elder
 */
public class NightSky {
   // double density;
   // int width;
   // int height;
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;
    
    
    
public NightSky(double density) {    
    this.density = density;
    this.width = 20;
    this.height = 10;
    this.starsInLastPrint = 0;
    
    
}
public NightSky(int width, int height){
    this.density = 0.1;
    this.width = width;
    this.height = height;
    this.starsInLastPrint = 0;
    
}

public NightSky(double density, int width, int height){
    this.width = width;
    this.height = height;
    this.density = density;
    this.starsInLastPrint = 0;
    
}

public void printLine(){
      
    int stars = 0;
    for(int y = 0; y < this.width; y++){
        Random star = new Random();
        
        
        if(star.nextDouble() < this.density){            
            System.out.print("*");
            this.starsInLastPrint();
            stars +=1;
            
                                  
            
        }else{
            System.out.print(" ");
            
            
        }
        
    }
    this.starsInLastPrint += stars;
    
    System.out.println(" ");
}
public void print(){       
    this.starsInLastPrint = 0;
    for(int i = 0; i < height; i++){
        printLine();                
        
    }   
        
}

public int starsInLastPrint(){    
       
    return(this.starsInLastPrint);
}
        
      
}
    






            

