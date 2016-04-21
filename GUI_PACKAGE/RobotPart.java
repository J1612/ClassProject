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
    private String type;
    private int partNumber;
    private double weight;
    private double price;
    private String description;

    
    public String getID() {
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


    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }
}