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
public class Torso extends RobotPart{
    
    private final int batteryComponents = 0; // 1 to 3
    private Head head;
    private Arm[] armArray;
    private Locomotor locomotor;
    private Battery[] batteryArray;

    public Torso(){
        
    }
    
    /**
     * @return the batteryComponents
     */
    public int getBatteryComponents() {
        return batteryComponents;
    }

    /**
     * @return the head
     */
    @Override
    public Head getHead() {
        return head;
    }

    /**
     * @param head the head to set
     */
    @Override
    public void setHead(Head head) {
        this.head = head;
    }

    /**
     * @return the arm
     */
    public Arm[] getArmArray() {
        return armArray;
    }

    /**
     * @param armArray the armArray to set
     */
    public void setArmArray(Arm[] armArray) {
        this.armArray = armArray;
    }

    /**
     * @return the locomotor
     */
    @Override
    public Locomotor getLocomotor() {
        return locomotor;
    }

    /**
     * @param locomotor the locomotor to set
     */
    @Override
    public void setLocomotor(Locomotor locomotor) {
        this.locomotor = locomotor;
    }

    /**
     * @return the battery
     */
    public Battery[] getBatteryArray() {
        return batteryArray;
    }

    /**
     * @param batteryArray the batteryArray to set
     */
    public void setBattery(Battery[] batteryArray) {
        this.batteryArray = batteryArray;
    }
    
    
    
}
