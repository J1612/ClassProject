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
    private String id;
    private double price;
    
    public Arm(double price, String id){
        this.price = price;
        this.id = id;
    }
    
    int powerConsumed(int speed){
        
        return 0;
    }

    @Override
    public String getType(){
        return type;
    }
    
    @Override
    public double getPrice() {
        return price;
    }
    
    
    @Override
    public String getID(){
        return id;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    

}
