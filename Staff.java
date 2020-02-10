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
public class Staff extends Person  {
    
    String joiningDate;
    String education;
    
    public Staff()
    {
        this.joiningDate=null;
        this.education=null;
    }
    
    public Staff(String name, String joiningDate, String education)
    {
        super(name);
        this.education=education;
        this.joiningDate=joiningDate;
    }
   
}
