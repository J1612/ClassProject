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
public abstract class RobotPart {
    
    private String name;
    private int partNumber;
    private double weight;
    private double cost;
    private String description;
    private Arm arm;
    private Battery battery;
    private Torso torso;
    private Locomotor locomotor;
    private Head head;

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPartNumber() {
        return partNumber;
    }


    public void setPartNumber(int partNumber) {
        this.partNumber = partNumber;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the arm
     */
    public Arm getArm() {
        return arm;
    }

    /**
     * @param arm the arm to set
     */
    public void setArm(Arm arm) {
        this.arm = arm;
    }

    /**
     * @return the battery
     */
    public Battery getBattery() {
        return battery;
    }

    /**
     * @param battery the battery to set
     */
    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    /**
     * @return the torso
     */
    public Torso getTorso() {
        return torso;
    }

    /**
     * @param torso the torso to set
     */
    public void setTorso(Torso torso) {
        this.torso = torso;
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
    
}
