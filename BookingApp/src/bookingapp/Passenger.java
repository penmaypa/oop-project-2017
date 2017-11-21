/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingapp;

/**
 *
 * @author x15044734
 */
public class Passenger extends Booking {

    protected String name;
    protected String address;
    protected int day;
    protected int month;
    protected int year;
    protected int quantity;

    public Passenger() {

        name = "";
        address = "";
        day = 1;
        month = 1;
        year = 1;
        quantity = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String printDetails() {
        return "Passenger Details:" + name + "," + address + "," + day + "," + month + "," + year + "," + quantity;
    }

}
