/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project_gui;

/**
 *
 * @author Marisa
 */
public class SalesAssociate {
    private String name;
    private int employeeNumber;
    private static int nextEmployeeNumber = 1;
    private Order[] orders;
    
    public SalesAssociate(){
        
    }
    
    public SalesAssociate (String name){
        this.name=name;
        this.employeeNumber = nextEmployeeNumber++;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getEmployeeNumber(){
        return this.employeeNumber;
    }

}
