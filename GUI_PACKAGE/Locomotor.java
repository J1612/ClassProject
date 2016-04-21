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
    private String id;
    private int maxSpeed;
    private double price;
    
    public Locomotor(String id, int maxSpeed, double price){
        this.id = id;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }
    
    public int powerConsumed(int speed){
        return 0;
    }
    
    @Override
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
    @Override
    public double getPrice() {
        return price;
    }

    /**
     * @return the id
     */
    @Override
    public String getID() {
        return id;
    }
    
    
    
}
