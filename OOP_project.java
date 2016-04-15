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
        String catalogueInput;
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
                
                /* Open Creation Menu */
                case "C":
                    createInput = "0";  // I reset this variable each time the Creation menu is chosen, otherwise the user could be 'locked out' of the Creation menu after using it for the first time.
                    while (!createInput.equals("Q")){
                        printCreateMenu();
                        createInput = sc.next();
                        System.out.println();
                        switch(createInput){
                            
                            /* Create Order */
                            case "O":
                                Order newOrder;
                                customerExists = false;
                                System.out.print("Enter your name: ");
                                customerName = sc.next();
                                
                                /* Check to see if customer exitst in our customerList */
                                for(Customer customer: customerList){
                                    if (customer.getName().equals(customerName)){
                                        System.out.println();
                                        /* This is where we need to dispay the catalog. We'll need a switch statement (or an if statement) for each option in the catalog */
                                        printCatalogue();
                                        catalogueInput = sc.next();
                                        switch(catalogueInput)
                                        {
                                            case "A":
                                                System.out.println("Thank you, " + customer.getName() + ", for your purchase!");
                                                newOrder = new Order("XX/XX/XXXX", customer, null, new RobotModel());
                                                customer.getOrders().add(newOrder);
                                                break;
                                            case "B":
                                                System.out.println("Thank you, " + customer.getName() + ", for your purchase!");
                                                newOrder = new Order("XX/XX/XXXX", customer, null, new RobotModel());
                                                customer.getOrders().add(newOrder);
                                                break;
                                            case "C":
                                                System.out.println("Thank you, " + customer.getName() + ", for your purchase!");
                                                newOrder = new Order("XX/XX/XXXX", customer, null, new RobotModel());
                                                customer.getOrders().add(newOrder);
                                                break;
                                            case "D":
                                                System.out.println("Thank you, " + customer.getName() + ", for your purchase!");
                                                newOrder = new Order("XX/XX/XXXX", customer, null, new RobotModel());
                                                customer.getOrders().add(newOrder);
                                                break;
                                            case "E":
                                                System.out.println("Thank you, " + customer.getName() + ", for your purchase!");
                                                newOrder = new Order("XX/XX/XXXX", customer, null, new RobotModel());
                                                customer.getOrders().add(newOrder);
                                                break;
                                            case "F":
                                                System.out.println("Thank you, " + customer.getName() + ", for your purchase!");
                                                newOrder = new Order("XX/XX/XXXX", customer, null, new RobotModel());
                                                customer.getOrders().add(newOrder);
                                                break;
                                            case "G":
                                                System.out.println("Thank you, " + customer.getName() + ", for your purchase!");
                                                newOrder = new Order("XX/XX/XXXX", customer, null, new RobotModel());
                                                customer.getOrders().add(newOrder);
                                                break;
                                            case "Q":
                                                break;
                                        }
                                        //System.out.println("Thank you, " + customer.getName() + ", for your purchase!");
                                        //Order newOrder = new Order("XX/XX/XXXX", customer, null, new RobotModel());
                                        //customer.getOrders().add(newOrder);
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
                                System.out.println();
                                currentCustomer = new Customer(customerName);
                                customerList.add(currentCustomer);
                                break;
                                
                            /* Create Robot Component */
                            case "R":
                                System.out.println("Do you wish to make a (H)ead, (L)ocomotor, (T)orso, (B)attery, or (A)rm?");
                                System.out.print("Your Choice: ");
                                robotComponent = sc.next();
                                switch(robotComponent){
                                    
                                    /* We need to change each case (except default) to add the robot component to an ArrayList of robotParts */
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
                                
                                /* Check to see if the customer exists in our customerList */
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
    public static void printCatalogue()
    {
        System.out.println("Robot Head Catalogue");
        System.out.println("-----------");
        System.out.println("(A) Buisness Can Robot Model(Smart Head,Button Torso,Fancy Legs Locomotor,Left and Right arms power)");
        System.out.println("(B) Button Can Robot Model(Antennaeless Head,Button Torso,Fancy Legs Locomotor,Both arms silver disk)");
        System.out.println("(C) Humanoid Soldier Robot Model(Soldier Head,Soldier Torso)");
        System.out.println("(D) Medic Can Robot Model(Antennaeless Head,Button Torso,Both arms power,Fancy Legs Locomotor)");
        System.out.println("(E) Orange Can Robot Model(Orange Antennae Head,Orange Can Torso,Orange Flatfoot Locomotor, Both arms orange power) ");
        System.out.println("(F) Orange Humanoid Robot Model(Orange Head,Orange Torso,Orange Locomotor,Both arms orange)");
        System.out.println("(G) White Can with Antennae Robot Model(Antennae Head,Can Torso,Flatfoot Locomotor)");
        System.out.println("(Q)uit to Report Menu");
        System.out.print("Your Choice: ");
        
    }
    
    
}
