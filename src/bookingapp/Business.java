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
    
    protected String meal;

    public Business() {
        myTickets = new Tickets();
        meal = "Just Main (drink excluded)";
    }

    @Override
    public void setTotalPrice(double totalPrice) {
        super.setTotalPrice(totalPrice); //To change body of generated methods, choose Tools | Templates.
    }

    
}
