/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project_gui;
import java.util.ArrayList;
/**
 *
 * @author Shaun
 */
public class Torso extends RobotPart{
    
    private final String type = "Torso";
    private int batteryComponents; // 1 to 3
    private Head head;
    private ArrayList<Arm> armArray;
    private Locomotor locomotor;
    private ArrayList<Battery> batteryArray;

    public Torso(){
        this.batteryComponents = 1;
        this.head = new Head();
        this.armArray = new ArrayList();
        this.locomotor = new Locomotor();
        this.batteryArray = new ArrayList();
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

    /**
     * @return the head
     */
    public Head getHead() {
        return head;
    }

    /**
     * @param head the head to set
     */
    public void setHead(Head head) {
        this.head = head;
    }

    /**
     * @return the arm
     */
    public ArrayList<Arm> getArmArray() {
        return armArray;
    }

    /**
     * @param armArray the armArray to set
     */
    public void setArmArray(ArrayList<Arm> armArray) {
        this.armArray = armArray;
    }

    /**
     * @return the locomotor
     */
    public Locomotor getLocomotor() {
        return locomotor;
    }

    /**
     * @param locomotor the locomotor to set
     */
    public void setLocomotor(Locomotor locomotor) {
        this.locomotor = locomotor;
    }

    /**
     * @return the battery
     */
    public ArrayList<Battery> getBatteryArray() {
        return batteryArray;
    }

    /**
     * @param batteryArray the batteryArray to set
     */
    public void setBattery(ArrayList<Battery> batteryArray) {
        this.batteryArray = batteryArray;
    }
    
    
    
}
