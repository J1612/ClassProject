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
public class Locomotor extends RobotPart{
    
    private final String type = "Locomotor";
    private int maxSpeed;
    private double price;

    public Locomotor(){
        this.maxSpeed = 0;
        this.price = 0.0;
    }
    
    public Locomotor(int maxSpeed, double price){
        this.maxSpeed = maxSpeed;
        this.price = price;
    }
    
    public int powerConsumed(int speed){
        return 0;
    }
    
    public String getType(){
        return type;
    }
    
    /**
     * @return the maxSpeed
     */
    public int getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * @param maxSpeed the maxSpeed to set
     */
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }
    
    
    
}
