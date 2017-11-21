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
public class Age extends Tickets{
    protected int adult;
    protected int child;
    protected int infant;
    
    public Age(){
        adult = 35;
        child = 20;
        infant = 5;
    }

    public Age(int adult, int child, int infant, int price, int total) {
        super(price, total);
        this.adult = adult;
        this.child = child;
        this.infant = infant;
    }
    
    
    
}
