/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project_master;

/**
 *
 * @author Shaun
 */
public class Shop {
    
    private Order[] orders;
    private RobotModel[] robotModels;
    private Customer[] customers;
    private SalesAssociate[] salesAssociate;
    
    
    public Shop()
    {
        this.orders = null;
        this.robotModels = null;
        this.customers = null;
        this.salesAssociate = null;
    }
    
    public Shop(Order[] orders, RobotModel[] robotModels, Customer[] customers, SalesAssociate[] salesAssociate)
    {
        this.orders = orders;
        this.robotModels = robotModels;
        this.customers = customers;
        this.salesAssociate = salesAssociate;
    }
    
    public Shop(RobotModel[] robotModels)
    {
        this.robotModels = robotModels;
    }
    
    void setRobotModels(RobotModel[] robotModels)
    {
        this.robotModels = robotModels;
    }
    
    RobotModel[] getRobotModels()
    {
        return robotModels;
    }
    
}

