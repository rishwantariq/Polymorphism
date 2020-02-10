/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author rishwantariq
 */
public class Doctor extends Medical {
    
    int docID;
    String speciality;
    ArrayList<Patient> listOfPatients=new ArrayList<Patient>();

   static int nextId=0;
    
    
  
    
public Doctor(String speciality, String name,String joiningDate, String ed) {
   
    super(name,joiningDate,ed);
    this.docID=nextId;
    nextId++;
    this.docID=docID;
    this.speciality=speciality;
    this.docID++;
}

public void patientVisit(Patient p) {
    
    if(p.count==0) {
        
        p.count=1;
        p.visited=true;
        System.out.println("Patient " + p.name  + " with Patient ID: " + p.patientID + " allowed to visit");
    }
    
    else
    {
        if(!patientCount(p)) {

     }  //checks if patient has visited before
    }
}



boolean patientCount(Patient p) {
  if(p.count==1 && p.visited==true)
  {
      System.out.println("Patient " + p.name  + " with Patient ID: " + p.patientID + " has already visited today");
      System.out.println();

      Calendar cal = Calendar.getInstance();
        if (cal.get(Calendar.HOUR_OF_DAY) >= 24) { //if day has passed set value to 0
              p.count=0;
              return false;
            }
      return true;
  }
  
      else {
      
          return false;
      }
  
  }





}