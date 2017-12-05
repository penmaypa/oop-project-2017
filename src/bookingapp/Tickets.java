
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingapp;

import java.io.Serializable;

/**
 *@author x16382003 - Penuel Maypa
 * @author x15044734 - Lawrence Bernabat
 * @author x16333223 - Rehan Naeem
 */

/*GITHUB
 * https://github.com/penmaypa/oop-project-2017/branches

REFERENCES:
The following resources was used as a learning resources are:
= https://beginnersbook.com/2013/03/inheritance-in-java/
= https://beginnersbook.com/2013/03/polymorphism-in-java/

We have also looked at the past Lab work to get an idea for our projects.
*/
public class Tickets implements Serializable{
   protected String departure;
   protected String destination;
   Booking myBooking = new Booking();
   protected double totalPrice;
   protected double testPrice;
   protected String snacks;
   protected String fName;
   protected String lName;
   
    public Tickets(){

     }
   
   
    // Penuel & Rehan
    public String getDeparture() {
        return departure ;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination ;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
   /* 
    public double getTotalPrice() {
        return totalPrice = totalPrice + myBooking.totalPrice;
    }
    */

 
    public double getTotalPrice() {
        return totalPrice ;
    }
    
    
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getTestPrice() {
        return testPrice = myBooking.getTestPrice();
    }

    public void setTestPrice(double testPrice) {
        this.testPrice = testPrice;
    }

    //Lawrence & Penuel
    public String getSnacks() {
        return snacks = "peanuts";
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
    
    
    
}