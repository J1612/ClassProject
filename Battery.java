/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project;

/**
 *
 * @author Shaun
 */
public class Battery extends RobotPart{
    
    private double energy;
    private double maxPower;

    public Battery(){
        
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
    
    
    
}
