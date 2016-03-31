/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project;

/**
 *
 * @author Marisa
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
    
    public double componentCost(){
        
        return 0.0;
    }
    
    public double maxSpeed(){
        
        return 0.0;
    }
    
    void OrderPart()
    {
        
    }
    
    void PartCost()
    {
        
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
