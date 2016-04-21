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
public class RobotModel {
    
    private String name;
    private String modelNumber;
    private double price;
    private ArrayList<RobotPart> robotparts;
    
    public RobotModel(){
        
    }
    
    public RobotModel(String name, String modelNumber, double price, ArrayList<RobotPart> robotparts)
    {
        this.name = name;
        this.modelNumber = modelNumber;
        this.price = price;
        this.robotparts = robotparts;
    }
    
    public double armCost(){
        return robotparts.get(0).getPrice();
    }
    
    public double batteryCost(){
        return robotparts.get(1).getPrice();
    }
    
    public double headCost(){
        return robotparts.get(2).getPrice();
    }
    
    public double locomotorCost(){
        return robotparts.get(3).getPrice();
    }
    
    public double torsoCost(){
        return robotparts.get(4).getPrice();
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
    public String getModelNumber() {
        return modelNumber;
    }

    /**
     * @param modelNumber the modelNumber to set
     */
    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    public void setPrice(ArrayList<RobotPart> robotParts) {
        double cost = 0;
        
        for(RobotPart part : robotParts){
            cost += part.getPrice();
        }
        
        this.price = cost;
        
    }

    /**
     * @return the robotparts
     */
    public ArrayList<RobotPart> getRobotparts() {
        return robotparts;
    }

    /**
     * @param robotparts the robotparts to set
     */
    public void setRobotparts(ArrayList<RobotPart> robotparts) {
        this.robotparts = robotparts;
    }
    
}
