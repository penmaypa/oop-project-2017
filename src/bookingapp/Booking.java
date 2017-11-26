/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingapp;
import java.io.Serializable;
/**
 *
 * @author x16382003
 */
public class Booking implements Serializable {
    protected double price;
    
    public Booking(){
        price = 20.00;
    }
    
    public Booking(Double price){
       this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
 
}
