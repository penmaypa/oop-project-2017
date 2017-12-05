/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingapp;

/**
 * @author x16382003 - Penuel Maypa
 * @author x15044734 - Lawrence Bernabat
 * @author x16333223 - Rehan Naeem
 * 
 *
 *PAIR PROGRAMMING -- Rehan & Lawrence
 * Writer - Lawrence
 * Observer - Rehan
 */
public class Business extends Tickets {
    
    Tickets myTickets;
    String meal;
    
    

    public Business() {
        super ();
        myTickets = new Tickets();
    }
    
    public double getTotalPrice(){
       return totalPrice = getTotalPrice() + 100.00;
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
