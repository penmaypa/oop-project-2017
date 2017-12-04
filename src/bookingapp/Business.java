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
    

    public Business() {
        myTickets = new Tickets();
    }
    
    @Override
    public String getSnacks() {
        return snacks = "Premium Cookies";
    }
    
   public String getMeal(){
       return " Main Course (excluding desert)";
   }
   
    
    
}
