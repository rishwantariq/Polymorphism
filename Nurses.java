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
public class Nurses extends Medical {
    
    
    public Nurses()
    {
        System.out.println("Nurses in medical dept.");
    }
    
    public Nurses(String name,String joiningDate,String education)
    {
        super(name,joiningDate,education);
    }
}
