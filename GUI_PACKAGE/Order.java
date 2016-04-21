/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project_gui;

import java.util.Scanner;
import java.util.Date;
/**
 *
 * @author Shaun
 */
public class Order {
    private static int nextNum = 1;
    private int orderNumber;
    private Date date;
    private Customer customer;
    private SalesAssociate salesAssociate;
    private RobotModel robotModel;
    
    public Order( Customer customer, SalesAssociate salesAssociate, RobotModel robotModel){
        this.orderNumber = nextNum++;
        this.date = new Date();
        this.customer = customer;
        this.salesAssociate = salesAssociate;
        this.robotModel = robotModel;
    }
    
    public Order(){
        
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
    public Date getDate() {
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

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * @param salesAssociate the salesAssociate to set
     */
    public void setSalesAssociate(SalesAssociate salesAssociate) {
        this.salesAssociate = salesAssociate;
    }

    /**
     * @param robotModel the robotModel to set
     */
    public void setRobotModel(RobotModel robotModel) {
        this.robotModel = robotModel;
    }
}
