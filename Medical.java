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
 public class Medical extends Staff {
    
    ArrayList<Integer> record=new ArrayList<Integer>();
    
    
    public void maintainRecord(Patient P) {
        record.add(P.patientID); //patient ID added to record
    }
    
    public Medical()
    {
        
    }
    
    public Medical(String name,String joiningdate, String education)
    {
        super(name,joiningdate,education);
        
    }
    
   
    
    
}
