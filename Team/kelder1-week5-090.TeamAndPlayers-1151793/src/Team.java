/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kern Elder
 */
import java.util.ArrayList;



public class Team {
    
    private int maxSize;
    private String name;
    private ArrayList<Player>teamz;

public Team(String name) {
    this.name = name;
    this.teamz = new ArrayList<Player>();
    this.maxSize = 16;
}

public String getName() {
    return this.name;
}

public void addPlayer(Player playr) {  
    if((teamz.size()) < (maxSize)) { //adds players to the team, as long as the size of the team is below the max
        teamz.add(playr);
    }
        
    }      

public void printPlayers() { 
    
    for(Player member:this.teamz){   
        System.out.println(member.toString());
}


}
public void setMaxSize(int maxSize) {
    
    this.maxSize = maxSize;  //take the maxSize initially set at 16, and resets it to a new value
     
}

public int size() {
    return teamz.size();
    
}

public int goals() {
    int score = 0;
    for(Player plars:teamz) { //adds goals of each player on team and returns total
        score += plars.goals();
        
       
        
    }
    return score;
    
}
 
}


        
