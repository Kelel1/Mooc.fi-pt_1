public class Reformatory {
    private int iter = 0;
    public int weight(Person person) {
        
        iter +=1;
        // return the weight of the person
        return person.getWeight();
    }
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1); 
    }
    
    public int totalWeightsMeasured() {
                  
       int i =iter;
       return i;
                
           
          
       }
       
       
    }         
        
    


