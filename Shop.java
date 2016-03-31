/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project;

/**
 *
 * @author Weston
 */

public class Shop {
    
    private RobotModel[] robotModels;
    
    public Shop()
    {
        robotModels = null;
    }
    
    public Shop(RobotModel[] robotModels)
    {
        this.robotModels = robotModels;
    }
    
    void setRobotModels(RobotModels[] robotModels)
    {
        this.robotModels = robotModels;
    }
    
    RobotModel[] getRobotModels()
    {
        return robotModels;
    }
    
    void createPart()
    {
        
    }
    
    void createRobot()
    {
        
    }
    
}
