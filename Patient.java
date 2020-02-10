/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap;

/**
 *
 * @author rishwantariq
 */
public class Patient extends Person {
    
    int patientID;
    int count;
    
 
static int nextId=0;

public Patient(String name) {
    super(name);
    nextId++;
    this.patientID=nextId; 
}
   
}
