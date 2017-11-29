/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingapp;
/**
 *
 * @author x16382003
 */
public class Booking {
    
    protected double basePrice;
    protected double depPrice;
    protected double desPrice;
    protected double totalPrice;
    private String departure;
    private String destination;
   
    
    public Booking(){
        basePrice = 20.00;
        depPrice = 0.00;
        desPrice = 0.00;
        

    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    
    

  
    
    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getDepPrice() {
        return depPrice;
    }

    public void setDepPrice(double depPrice) {
        this.depPrice = depPrice;
    }

    public double getDesPrice() {
        return desPrice;
    }

    public void setDesPrice(double desPrice) {
        this.desPrice = desPrice;
    }
    
    
    public double totalPrice(double basePrice, double depPrice, double desPrice){
        return basePrice + depPrice + desPrice;
    }
    

}


 /*
    public Booking(Double price){
       this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    */