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
public class RobotModelTest {
    
    public void test(RobotModel testModel){
        testModel.getName();
        testModel.getModelNumber();
        testModel.getPrice();
        testModel.getRobotparts();

        System.out.println("Robot model: " + testModel.getName() + " PASSED TEST");
    }
    
}
