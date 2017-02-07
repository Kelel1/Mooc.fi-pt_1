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
public class BirdzLibrary {
    private ArrayList <Birdz> birds;
    
public ArrayList<Birdz> BirdzLibrary(){
    return this.birds;
}

public void stat(){
     
    for(Birdz bird : birds){
        System.out.println(bird.toString());
      
}
}

public void addBirdz(Birdz newBird){
    birds.add(newBird);
}
    
}

