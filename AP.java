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
public class AP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        FaisalHospital hospital = new FaisalHospital();
        
        //adding wards to hospital
        Ward w = new ChildrenWard();
        Ward w1 = new OrthopedicWard(); 
        Ward w2 = new SurgicalWard();
        
        hospital.addToWard(w);
        hospital.addToWard(w1);
        hospital.addToWard(w2);
        
         //creating doctors
         Doctor d1 = new Doctor("Doctor","Adam","17-02-2006","MBA");
         Doctor d2 = new Doctor("Surgeon","Mark","30-12-1997","MBA");
         Doctor d3 = new Doctor("Children Surgeon", "Paul","18-12-2008","MBA");
         
        //creating technician
        Technical t1 = new Technician();
        System.out.println();
        //add to staff
        
        w.addStaff(d1);
        w.addStaff(d2);;
        w.addStaff(t1);
        
        
        //create patient
        Patient p1 = new Patient("Ali");
        Patient p2 = new Patient("Rishwan");
        
        hospital.addToRecord(p1);
        hospital.addToRecord(p2);
        
        hospital.visit(d1);
        hospital.visit(d2);
        hospital.visit(p1);
        hospital.visit(p2);
        
        d1.patientVisit(p1);
        d1.patientVisit(p1);
        
        d1.patientVisit(p2);
        System.out.println();

        
        
        
    }
    
}
