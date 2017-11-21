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
public class Tickets {
    protected int price;
    protected int total;
    
    public Tickets(){
        price = 20;
        total = 0;
    }

    public Tickets(int price, int total) {
        this.price = price;
        this.total = total;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }
    
    
    
    
}
