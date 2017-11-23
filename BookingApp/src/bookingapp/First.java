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
public class First extends Tickets {
    protected int first;
    protected int quantity;
    
    public First(){
        first = 25;
        quantity = 0;
    }

    public First(int first, int quantity, int price, int total) {
        super(price, total);
        this.first = first;
        this.quantity = quantity;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
