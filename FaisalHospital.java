/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap;

import java.util.ArrayList;

/**
 *
 * @author rishwantariq
 */
public class FaisalHospital {
    
    ArrayList<Ward> ward=new ArrayList<Ward>();
    
    ArrayList<Person> record = new ArrayList<Person>();
    
    
    
public void visit(Person p) {
    
    p.visited=true;
    addToRecord(p);
}

public void addToRecord(Person p)
{
    record.add(p);
}

public void addToWard(Ward w)
{
    this.ward.add(w); //adds ward to a hospital
}
    
}
