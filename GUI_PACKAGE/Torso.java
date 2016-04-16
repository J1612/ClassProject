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
    private int batteryComponents; // 1 to 3

    public Torso(){
        this.batteryComponents = 1;
    }
    
    public String getType(){
        return type;
    }
    
    /**
     * @return the batteryComponents
     */
    public int getBatteryComponents() {
        return batteryComponents;
    }
    
}
