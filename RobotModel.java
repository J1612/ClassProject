/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project_master;

/**
 *
 * @author Shaun
 */
public class RobotModel {
    
    private String name;
    private int modelNumber;
    private double price;
    private RobotPart[] robotparts;
    
    public RobotModel(String name, int modelNumber, double price, RobotPart[] robotparts)
    {
        this.name = name;
        this.modelNumber = modelNumber;
        this.price = price;
        this.robotparts = robotparts;
    }
    
    public double armCost(){
        return robotparts[0].getArm().getCost();
    }
    
    public double batteryCost(){
        return robotparts[1].getBattery().getCost();
    }
    
    public double headCost(){
        return robotparts[2].getHead().getCost();
    }
    
    public double locomotorCost(){
        return robotparts[3].getLocomotor().getCost();
    }
    
    public double torsoCost(){
        return robotparts[4].getTorso().getCost();
    }
    
    public double maxSpeed(){
        return robotparts[2].getLocomotor().getMaxSpeed();
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the modelNumber
     */
    public int getModelNumber() {
        return modelNumber;
    }

    /**
     * @param modelNumber the modelNumber to set
     */
    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the robotparts
     */
    public RobotPart[] getRobotparts() {
        return robotparts;
    }

    /**
     * @param robotparts the robotparts to set
     */
    public void setRobotparts(RobotPart[] robotparts) {
        this.robotparts = robotparts;
    }
    
}
