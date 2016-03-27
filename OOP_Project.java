/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project;
import java.util.Scanner;
/**
 *
 * @author Shaun
 */
public class OOP_Project {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String mainInput;
        String createInput = "0";
        
        printMainMenu();
        mainInput = sc.next();
        System.out.println();
        while (!mainInput.equals("Q")){
            
            switch(mainInput){
                case "C":
                    while (!createInput.equals("Q")){
                        printCreateMenu();
                        createInput = sc.next();
                        System.out.println();
                    }
                    createInput = "0";
                    break;
            }
            printMainMenu();
            mainInput = sc.next();
            System.out.println();
        }
    }
    
    public static void printMainMenu(){
        System.out.println("Main Menu");
        System.out.println("---------");
        System.out.println("(C)reate");
        System.out.println("(R)eport");
        System.out.println("(S)ave");
        System.out.println("(Q)uit");
        System.out.print("Your Choice: ");
    }
    
    public static void printCreateMenu(){
        System.out.println("Creation Menu");
        System.out.println("-------------");
        System.out.println("(O)rder");
        System.out.println("(C)ustomer");
        System.out.println("(S)ales Associate");
        System.out.println("(R)obot Component");
        System.out.println(" Robot (M)odel");
        System.out.println("(Q)uit to Main Menu");
        System.out.print("Your Choice: ");
    }
    
}
