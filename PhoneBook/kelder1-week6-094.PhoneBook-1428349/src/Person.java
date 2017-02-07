/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kern Elder
 */
public class Person {    
    private String name;
    private String number;
    
    public Person(String firstName, String numb) {
        this.name = firstName;
        this.number = numb;
    }
   
    
    public String toString(){
        return this.name + " number: " + this.number;    
    }

    public String getName() {
        return this.name;
    }

    public String getNumber() {
        return this.number;
    }

    public void changeNumber(String newNumber) {
        this.number = newNumber;
    }
    
    
    
    }
