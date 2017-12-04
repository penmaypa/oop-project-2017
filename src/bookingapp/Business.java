/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingapp;

/**
 *
 * @author x16333223
 */
public class Business extends Tickets {
    
    Tickets myTickets;
    String meal;
    
    

    public Business() {
        super ();
        myTickets = new Tickets();
    }
    
    @Override
    public String getSnacks() {
        return snacks = "Premium Cookies";
    }
    
   public String getMeal(){
       return meal = "Main Course (excluding desert)";
   }

    public void setMeal(String meal) {
        this.meal = meal;
    }
   
    
}
