/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingapp;

/**
 *@author x16382003 - Penuel Maypa
 * @author x15044734 - Lawrence Bernabat
 * @author x16333223 - Rehan Naeem
 */
public class First extends Tickets {
    String meal;
    String drink;
    
    public First(){
        super();
        meal = "";
        drink = "";
    }

    @Override
    public String getSnacks() {
        return snacks = "Scones, Cupcake & Coffee";
    }
    
    
    public String getMeal() {
        return "5 Course Meal";
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }
    
    
    public String getDrink(){
        return "a bottle of wine & unlimited coffee/tea" ;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
    
}
