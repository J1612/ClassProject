/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project;

/**
 *
 * @author Weston
 */


public class Customer {

    private String name;
    private int customerNumber;
    private double wallet;
    private Order[] orders;
    
    public Customer()
    {
        name = null;
        customerNumber = 0;
        wallet = 0.0;
        orders = null;
    }
    
    public Customer(String name, int customerNumber, double wallet, Order[] orders)
    {
        this.name = name;
        this.customerNumber = customerNumber;
        this.wallet = wallet;
        this.orders = orders;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public int getCustomerNumber()
    {
        return customerNumber;
    }
    
    public void setCustomerNumber(int customerNumber)
    {
        this.customerNumber = customerNumber;
    }
    
    public double getWallet()
    {
        return wallet;
    }
    
    public void setWallet(double wallet)
    {
        this.wallet = wallet;
    }
    
    public Order[] getOrders()
    {
        return orders;
    }
    
    public void setOrders(Order[] orders)
    {
        this.orders = orders;
    }
    
}
