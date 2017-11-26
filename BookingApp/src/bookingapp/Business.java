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
    protected int business;
    protected int quantity;
    
    public Business(){
        business = 15;
        quantity = 0;
    }

    public Business(int business, int quantity, int price, int total) {
        super(price, total);
        this.business = business;
        this.quantity = quantity;
    }

    public void setBusiness(int business) {
        this.business = business;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
