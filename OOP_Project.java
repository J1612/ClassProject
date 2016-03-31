/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author Shaun
 */
public class OOP_Project {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String mainInput;
        String createInput;
        String robotComponent;
        String name;
        int modelNumber;
        double price;
        
        printMainMenu();
        mainInput = sc.next();
        System.out.println();

        while (!mainInput.equals("Q")){
            switch(mainInput){
                case "C":
                    createInput = "0";
                    while (!createInput.equals("Q")){
                        printCreateMenu();
                        createInput = sc.next();
                        System.out.println();
                        try{
                            switch(createInput){
                            
                            /* Create Robot Component */
                                case "R":
                                    System.out.println("Do you wish to make a (H)ead, (L)ocomotor, (T)orso, (B)attery, or (A)rm?");
                                    System.out.print("Your Choice: ");
                                    robotComponent = sc.next();
                                    switch(robotComponent){
                                        case "H":
                                            Head head = new Head();
                                            break;

                                        case "L":
                                            Locomotor locomotor = new Locomotor();
                                            break;

                                        case "T":
                                            Torso torso = new Torso();
                                            break;

                                        case "B":
                                            Battery battery = new Battery();
                                            break;

                                        case "A":
                                            Arm arm = new Arm();
                                            break;

                                        default:
                                            System.out.println("You entered an invalid input. Your choices were 'H', 'L', 'T', 'B', 'A'");
                                            break;
                                    }
                                    System.out.println();
                                    break;
                            
                                /* Create Robot Model */
                                case "M":
                                    System.out.println("What is the name of the model?");
                                    System.out.print("Your Input: ");
                                    name = sc.next();

                                    System.out.println("What is the model number?");
                                    System.out.print("Your Input: ");
                                    modelNumber = sc.nextInt();

                                    System.out.println("What is the price?");
                                    System.out.print("Your Input: ");
                                    price = sc.nextDouble();

                                    RobotPart[] robotParts = {new Head(), new Locomotor(), new Torso(), new Battery(), new Arm()};

                                    RobotModel robotModel = new RobotModel(name, modelNumber, price, robotParts);
                                    System.out.println();
                                    break;
                                
                                
                                default:
                                System.out.println("Not Implemented Yet.");
                                break;
                            }
                            
                        }
                        catch(InputMismatchException e){
                            System.out.println();
                            System.out.println("*************************************");
                            System.out.println("Program recieved incorrect input");
                            System.out.println("The name shouldn't include any whitespace");
                            System.out.println("The model number should be an integer");
                            System.out.println("The price should be a decimal number");
                            System.out.println("*************************************");
                                    
                            createInput = sc.next(); // Fix to strange menu-printing and assignment of sc.nextInt() to createInput in line 80 
                            System.out.println();
                        }
                    }
                    break;
                    
                default:
                    System.out.println("Not Implemented Yet.");
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
