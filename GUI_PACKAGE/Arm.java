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
public class Arm extends RobotPart{
    
    private final String type = "Arm";
    private double price;
    
    public Arm(){
        this.price = 0.0;
    }
    
    public Arm(double price){
        this.price = price;
    }
    
    int powerConsumed(int speed){
        
        return 0;
    }

    public String getType(){
        return type;
    }
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    

}
