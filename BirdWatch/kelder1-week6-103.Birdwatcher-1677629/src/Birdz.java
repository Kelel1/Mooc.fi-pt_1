
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
//create class Birdz 

public class Birdz {
    private String name;
    private String latinName;
    private int obsevations;
    
    
    
public Birdz(){ 
    
    this.name = "";
    this.latinName = "";
    this.obsevations = 0;
            
}



public void setName(String brdName){
    this.name = brdName;
}

public void setLatName(String brdName2){
    this.latinName = brdName2;
}
public void setObservations(){
    this.obsevations += 1;
}



public String getName(){
    return this.name;
}



public String toString(){
    return(this.name + " (" + this.latinName + "): " + this.obsevations + " observations");
}

    
    
}
