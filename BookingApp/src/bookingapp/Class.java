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
public class Class extends Tickets{
    protected int economy;
    protected int business;
    protected int first;
    
    public Class(){
        economy = 0;
        business = 40;
        first = 80;
                
    }

    public Class(int economy, int business, int first, int price, int total) {
        super(price, total);
        this.economy = economy;
        this.business = business;
        this.first = first;
    }

    public void setEconomy(int economy) {
        this.economy = economy;
    }

    public void setBusiness(int business) {
        this.business = business;
    }

    public void setFirst(int first) {
        this.first = first;
    }
    
    
}
