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
//And the mods begins
public class Booking {
    
    protected double basePrice;
    protected double depPrice;
    protected double desPrice;
    protected double totalPrice;
    protected String departure;
    protected String destination;
    protected int adult;
    protected int child;
    protected int infant;
    protected double adultPrice;
    protected double childPrice;
    protected double infantPrice;
    protected double testPrice ;
  
    
    public Booking(){
        basePrice = 20.00;
        depPrice = 0.00;
        desPrice = 0.00;
        adultPrice = 10.00;
        childPrice = 5.00;
        infantPrice = 0.00;
        adult = 0;
        child= 0 ;
        infant = 0;
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
    
     public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }


    public void setDestination(String destination) {
        this.destination = destination;
    }

  

    public double getDepPrice() {
        if("Dublin".equals(departure)){
            return depPrice = 20.00;
         }
         else{   
            return depPrice = 30.00;
         }
    }
    
      public void setDepPrice(double depPrice) {
        this.depPrice = depPrice;
    }

    
    public double getDesPrice() {
       if("London".equals(destination)){
            return desPrice = 30.00;
         }
         else{   
            return desPrice = 60.00;
         }
    }
    
     public void setDesPrice(double desPrice) {
        this.desPrice = desPrice;
    }

  
    public void setAdult(int adult) {
        this.adult = adult;
    }

    public void setChild(int child) {
        this.child = child;
    }

    public void setInfant(int infant) {
        this.infant = infant;
    }
     
     

    /*public void setAdultPrice(double adultPrice) {
        this.adultPrice = adultPrice;
    }

    public void setChildPrice(double childPrice) {
        this.childPrice = childPrice;
    }

    public void setInfantPrice(double infantPrice) {
        this.infantPrice = infantPrice;
    } */

    public double getAdultPrice() {
        if("Adult".equals(adult)){
            return adultPrice = 10.00;
        }
        else{
            return adultPrice = 0.00;
        }
    }
    

    public double getChildPrice() {
        if("Child".equals(child)){
           return childPrice = 5.00;
        }
         else{   
            return childPrice = 0.00;
         }
    }

    public double getInfantPrice() {
        if("Infant".equals(infant)){
          return infantPrice = 0.00;
        }
        else{   
            return infantPrice = 0.00;
         }
    }

    public int getAdult() {
        return adult;
    }

    public int getChild() {
        return child;
    }

    public int getInfant() {
        return infant;
    }

    public void computeTotal(){
    
        
    }

     public double getTotalPrice() {
        return totalPrice = ((depPrice + desPrice+adultPrice)*adult)+((depPrice + desPrice+childPrice)*child)/*infant is free*/ ;
       // return totalPrice = 999.00;
    }
  

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getTestPrice() {
        return testPrice = 777.00;
    }

    public void setTestPrice(double testPrice) {
        this.testPrice = testPrice;
    }
    

}

