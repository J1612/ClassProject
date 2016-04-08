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

public class Shop {
    
    private Order[] orders;
    private RobotModel[] robotModels;
    private Customer[] customers;
    private SalesAssoc[] salesAssoc;
    
    public Shop()
    {
        orders = null;
        robotModels = null;
        customers = null;
        salesAssoc = null;
    }
    
    public Shop(Order[] orders, RobotModel[] robotModels, Customer[] customers, SalesAssoc[] salesAssoc)
    {
        this.orders = orders;
        this.robotModels = robotModels;
        this.customers = customers;
        this.salesAssoc = salesAssoc;
    }
    
    void setRobotModels(RobotModels[] robotModels)
    {
        this.robotModels = robotModels;
    }
    
    RobotModel[] getRobotModels()
    {
        return robotModels;
    }
    
    Order[] getOrders()
    {
        return orders;
    }
    
    void setOrders(Order[] orders)
    {
        this.orders = orders;
    }
    
    Customer[] getCustomers()
    {
        return customers;
    }
    
    void setCustomers(Customer[] customer)
    {
        this.customers = customers;
    }
    
    SalesAssoc[] getSalesAssoc()
    {
        return salesAssoc;
    }
    
    void setSalesAssoc(SalesAssoc[] salesAssoc)
    {
        this.salesAssoc = salesAssoc;
    }
}
