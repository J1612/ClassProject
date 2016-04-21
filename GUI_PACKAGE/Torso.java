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
public class Torso extends RobotPart{
    
    private final String type = "Torso";
    private String id;
    private int batteryComponents; // 1 to 3
    private double price;
    
    public Torso(String id, int batteryComponents, double price){
        this.id = id;
        this.batteryComponents = batteryComponents;
        this.price = price;
    }
    
    @Override
    public String getType(){
        return type;
    }
    
    /**
     * @return the batteryComponents
     */
    public int getBatteryComponents() {
        return batteryComponents;
    }

    /**
     * @return the id
     */
    @Override
    public String getID() {
        return id;
    }

    /**
     * @return the price
     */
    @Override
    public double getPrice() {
        return price;
    }
    
}
