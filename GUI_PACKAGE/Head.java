/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project_gui;

/**
 *
 * @author Shaun
 */
public class Head extends RobotPart{
    
    private final String type = "Head"; 
    private String id;
    private double price;

    public Head(String id, double price){
        this.id = id;
        this.price = price;
    }
    
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getType() {
        return type;
    }

    /**
     * @return the id
     */
    @Override
    public String getID() {
        return id;
    }
    
}
