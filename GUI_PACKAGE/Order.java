/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project_gui;

import java.util.Scanner;
/**
 *
 * @author Shaun
 */
public class Order {
    private static int nextNum = 1;
    private int orderNumber;
    private String date;
    private Customer customer;
    private SalesAssociate salesAssociate;
    private RobotModel robotModel;
    
    public Order(String date, Customer customer, SalesAssociate salesAssociate, RobotModel robotModel){
        this.orderNumber = nextNum++;
        this.date = date;
        this.customer = customer;
        this.salesAssociate = salesAssociate;
        this.robotModel = robotModel;
    }
    
    public double robotPrice(){
        
        return this.getRobotModel().getPrice();
    }
    
    public double calculateShipping(){
        
        return 0.0;
    }
    
    public double calculateTax(){
        
        return 0.0;
    }
    
    public double totalPrice(){
        
        return robotPrice() + calculateShipping() + calculateTax();
    }

    /**
     * @return the orderNumber
     */
    public int getOrderNumber() {
        return orderNumber;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @return the salesAssociate
     */
    public SalesAssociate getSalesAssociate() {
        return salesAssociate;
    }

    /**
     * @return the robotModel
     */
    public RobotModel getRobotModel() {
        return robotModel;
    }
}
