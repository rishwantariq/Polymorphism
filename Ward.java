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
public class Ward {
    String type; //type of ward
    ArrayList<Staff> staff = new ArrayList<Staff>(); 
    
    
    public Ward() {
     this.type=null;
    }
    public Ward(String ward) {
        this.type=ward;
    }
    
    public void addStaff(Staff P) {
        
        staff.add(P);
    }
    
}
