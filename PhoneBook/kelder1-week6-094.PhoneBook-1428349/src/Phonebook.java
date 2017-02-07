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

public class Phonebook {    
    private ArrayList<Person> persons = new ArrayList<Person>();    



public void add(String name, String number) {
    Person personas = new Person(name, number);
    persons.add(personas);
}

public void printAll() {
    for (Person people: persons) {
        System.out.println(people);
}

}

    public String searchNumber(String name) {
        for (Person people: persons) {            
            if (people.getName().contains(name)) {
                return people.getNumber();
            }
        }
        
        return "number not known";
    }        
    
    

}
    



