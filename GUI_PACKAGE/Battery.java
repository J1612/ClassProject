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
public class Battery extends RobotPart{
    
    private final String type = "Battery";
    private String id;
    private double energy;
    private double maxPower;
    private double price;

    public Battery(){
        
    }
    
    public Battery(String id, double energy, double maxPower, double price){
        this.id = id;
        this.energy = energy;
        this.maxPower = maxPower;
        this.price = price;
    }
    
    @Override
    public String getType(){
        return type;
    }
    
    /**
     * @return the energy
     */
    public double getEnergy() {
        return energy;
    }

    /**
     * @param energy the energy to set
     */
    public void setEnergy(double energy) {
        this.energy = energy;
    }

    /**
     * @return the maxPower
     */
    public double getMaxPower() {
        return maxPower;
    }

    /**
     * @param maxPower the maxPower to set
     */
    public void setMaxPower(double maxPower) {
        this.maxPower = maxPower;
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
