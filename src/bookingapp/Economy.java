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
    protected int economy;
    protected int quantity;
    Tickets myTickets ;
    
    public Economy(){
        myTickets = new Tickets();
        economy = 0;
        quantity = 0;
        
    }

    public Economy(int economy, int quantity, int price, int total) {
        this.economy = economy;
        this.quantity = quantity;
    }

}
