/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Shaun
 */
public class OOP_project {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Customer currentCustomer;
        String mainInput;
        String createInput;
        String reportInput;
        String robotComponent;
        String name;
        String customerName;
        int modelNumber;
        double price;
        boolean customerExists;
        ArrayList<Customer> customerList = new ArrayList();
        ArrayList<Order> orderList = new ArrayList();
        
        
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
                        switch(createInput){
                            
                            /* Create Order */
                            case "O":
                                customerExists = false;
                                System.out.print("Enter your name: ");
                                customerName = sc.next();
                                for(Customer customer: customerList){
                                    if (customer.getName().equals(customerName)){
                                        System.out.println("Thank you, " + customer.getName() + ", for your purchase!");
                                        Order newOrder = new Order("XX/XX/XXXX", customer, null, new RobotModel());
                                        customer.getOrders().add(newOrder);
                                        customerExists = true;
                                        break;
                                    }
                                }
                                if (customerExists == false){
                                    System.out.println("You are not in the record. Select 'Customer' in the Creation menu to add your profile.");
                                }
                                customerExists = false;
                                System.out.println();
                                break;
                            
                            /* Create Customer */
                            case "C":
                                System.out.print("Enter your name (Be sure to remember every character): ");
                                customerName = sc.next();
                                System.out.println("You were added to the record just now.");
                                currentCustomer = new Customer(customerName);
                                customerList.add(currentCustomer);
                                break;
                                
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
                                
                                /* Exit Create Menu */
                                case "Q":
                                    break;
                                    
                                default:
                                    System.out.println("Not Implemented Yet.");
                                    break;
                            }
                    }
                    break;
                
                /* Open Report Menu */
                case "R":
                    reportInput = "0";
                    while (!reportInput.equals("Q")){
                        printReportMenu();
                        reportInput = sc.next();
                        switch (reportInput){
                            
                            /* Show Orders */
                            case "O":
                                customerExists = false;
                                System.out.print("Enter your name (If you've entered it before, be sure to use the same exact characters): ");
                                customerName = sc.next();
                                for (Customer customer : customerList){
                                    if (customer.getName().equals(customerName)){
                                        customerExists = true;
                                        System.out.println("Your orders are as follows: ");
                                        for (Order order : customer.getOrders()){
                                            System.out.println("Order #" + order.getOrderNumber() + " for $" + order.totalPrice());
                                        }
                                        break;
                                    }
                                }
                                if (customerExists == false){
                                    System.out.println("The specified name was not found.");
                                }
                                customerExists = false;
                                break;
                                
                            case "Q":
                               break;
                               
                            default:
                                System.out.println("Not Implemented Yet.");
                                break;
                        }
                        System.out.println();
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
    
    public static void printReportMenu(){
        System.out.println("Report Menu");
        System.out.println("-----------");
        System.out.println("(O)rders");
        System.out.println("(C)ustomers");
        System.out.println("(S)ales Associates");
        System.out.println("(R)obot Components");
        System.out.println("Robot (M)odels");
        System.out.println("(Q)uit to Main Menu");
        System.out.print("Your Choice: ");
    }
    
}
