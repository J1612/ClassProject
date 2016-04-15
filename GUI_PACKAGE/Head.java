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
    private double price;
    
    public Head(){
        this.price = 0.0;
    }

    public Head(double price){
        this.price = price;
    }
    
    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
    
}
