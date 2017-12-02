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
public class Economy extends Tickets {

    Tickets myTickets ;
    String destination1;
    
    public Economy(){
        myTickets = new Tickets();
        destination1 = "";
 
    }

    public String getDestination1() {
        return myTickets.getDestination();
    }

    public void setDestination1(String destination1) {
        myTickets.setDestination(destination);
    }
    


}
