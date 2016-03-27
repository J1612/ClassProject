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
public class Locomotor extends RobotPart{
    
    private int maxSpeed;

    public Locomotor(){
        
    }
    
    public int powerConsumed(int speed){
        return 0;
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
    
    
    
}
