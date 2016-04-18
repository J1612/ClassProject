/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project_gui;


import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Shaun
 */
public class OOP_project_GUI {
    
    public static void main(String[] args) throws MalformedURLException {
        
        ArrayList<Customer> userList = new ArrayList();
        ArrayList<SalesAssociate> salesAssociateList = new ArrayList();
        ArrayList<RobotModel> modelList = new ArrayList();
        ArrayList<RobotPart> partList = new ArrayList();
        
        JFrame window = new JFrame("Robbie Robot Shop");
        window.setLayout(new FlowLayout(FlowLayout.CENTER));
        window.setSize(800, 500);
        window.getContentPane().setBackground(Color.ORANGE);
        window.setLocationRelativeTo(null); // Have the JFrame appear on the center of the monitor
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel welcome = new JLabel();
        Font font = new Font("WelcomeFont", Font.ITALIC, 20);
        welcome.setFont(font);
        welcome.setForeground(Color.BLUE);
        welcome.setText("Welcome to the Robbie Robot Shop!");
        window.add(welcome);
        
        window.add(new JLabel(new ImageIcon("C:\\Users\\Shaun\\Documents\\NetBeansProjects\\OOP_project_GUI\\src\\oop_project_gui\\robot_waving.gif")));
        
        /* Create a menu bar and have several drop-down menus (File, Create, etc.) containing their respective items */
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(Color.PINK);
        JMenu menu = new JMenu("File");
        JMenuItem item = new JMenuItem("New Shop");
        menu.add(item);
        item = new JMenuItem("Load Shop");
        menu.add(item);
        item = new JMenuItem("Save Shop");
        menu.add(item);
        menuBar.add(menu);
        /* Finished working on the File menu */
        
        /* Begin working on the Creation menu and its items */
        menu = new JMenu("Create");
        
        
        item = new JMenuItem("Order");
        item.addActionListener((ActionEvent event) -> {
            JFrame orderWindow = new JFrame("Create Order");
            orderWindow.setLayout(new FlowLayout());
            orderWindow.setSize(500,150);
            orderWindow.setLocationRelativeTo(window);

            /* Create JLabel and JTextField for the username */
            JLabel usernamePrompt = new JLabel("Enter your username:");
            usernamePrompt.setHorizontalAlignment(SwingConstants.RIGHT);  
            orderWindow.add(usernamePrompt);
            JTextField username = new JTextField(20);
            orderWindow.add(username);
            
            /* Create JLabel and JTextField for the associate */
            JLabel associatePrompt = new JLabel("Enter the name of the sales associate:");
            associatePrompt.setHorizontalAlignment(SwingConstants.RIGHT);
            orderWindow.add(associatePrompt);          
            JTextField associate = new JTextField(20);
            orderWindow.add(associate);
            
            /* Create an ActionListener for username */
            username.addActionListener((ActionEvent usernameEvent) -> {
                if (findUsername(userList, username.getText()) == false){
                    JOptionPane.showMessageDialog(orderWindow, "That username is not recognized", "Name Error", JOptionPane.ERROR_MESSAGE);
                }
            });
            
            /* Create an ActionListener for associate */
            associate.addActionListener((ActionEvent associateEvent) -> {
                if (findAssociate(salesAssociateList, associate.getText()) == false){
                    JOptionPane.showMessageDialog(orderWindow, "That person is not employed as a Sales Associate", "Name Error", JOptionPane.ERROR_MESSAGE);
                }
            });
            
            /* Create a "Next" button for the user to move on */
            JButton nextButton = new JButton("Next");
            nextButton.setVisible(true);
            orderWindow.add(nextButton);
            
            nextButton.addActionListener((ActionEvent buttonEvent) -> {
                if ((findAssociate(salesAssociateList, associate.getText()) == true) && (findUsername(userList, username.getText()) == true)){
                    // FIX: SHOW CATALOG, LET USER CHOOSE, SAVE CHOICE IN CUSTOMER HISTORY
                }
                else{
                    JOptionPane.showMessageDialog(orderWindow, "Both fields must be filled with a valid name.", "Name Error", JOptionPane.ERROR_MESSAGE);
                }
            });
            
            orderWindow.setVisible(true);
        });
        menu.add(item);
        item = new JMenuItem("Customer");
        item.addActionListener((ActionEvent event) -> {
            String inputName = JOptionPane.showInputDialog(window, "Enter your username:");
            if (inputName != null){
                if (findUsername(userList, inputName) == true){
                    JOptionPane.showMessageDialog(window, "That username has aleady been created.", "Username Already Exists", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    userList.add(new Customer(inputName));
                    JOptionPane.showMessageDialog(window, "You were successfully added!", "Username Added", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        menu.add(item);
        item = new JMenuItem("Sales Associate");
        item.addActionListener((ActionEvent event) -> {
            String inputName = JOptionPane.showInputDialog(window, "Enter your full name:");
            if (inputName != null){
                if (findAssociate(salesAssociateList, inputName) == true){
                    JOptionPane.showMessageDialog(window, "That associate has aleady been employed.", "Sales Associate Already Exists", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    salesAssociateList.add(new SalesAssociate(inputName));
                    JOptionPane.showMessageDialog(window, "You were successfully added!", "Sales Associate Added", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        menu.add(item);
        item = new JMenuItem("Robot Model");
        // FIX: ADD ACTION EVENT
        menu.add(item);
        item = new JMenuItem("Robot Component");
        item.addActionListener((ActionEvent event) -> {
            JFrame componentFrame = new JFrame("Create Component");
            componentFrame.setSize(300,200);
            componentFrame.setLocationRelativeTo(window);
            
            JPanel componentPanel = new JPanel();
            BoxLayout boxLayout = new BoxLayout(componentPanel, BoxLayout.Y_AXIS);
            componentPanel.setLayout(boxLayout);
            
            ButtonGroup buttonGroup = new ButtonGroup();
            
            JRadioButton armButton = new JRadioButton("Create Arm");
            armButton.setAlignmentX(Component.CENTER_ALIGNMENT);
            componentPanel.add(armButton);
            buttonGroup.add(armButton);
            
            JRadioButton batteryButton = new JRadioButton("Create Battery");
            batteryButton.setAlignmentX(Component.CENTER_ALIGNMENT);
            componentPanel.add(batteryButton);
            buttonGroup.add(batteryButton);
            
            JRadioButton headButton = new JRadioButton("Create Head");
            headButton.setAlignmentX(Component.CENTER_ALIGNMENT);
            componentPanel.add(headButton);
            buttonGroup.add(headButton);
            
            JRadioButton locomotorButton = new JRadioButton("Create Locomotor");
            locomotorButton.setAlignmentX(Component.CENTER_ALIGNMENT);
            componentPanel.add(locomotorButton);
            buttonGroup.add(locomotorButton);
            
            JRadioButton torsoButton = new JRadioButton("Create Torso");
            torsoButton.setAlignmentX(Component.CENTER_ALIGNMENT);
            componentPanel.add(torsoButton);
            buttonGroup.add(torsoButton);
            
            JButton nextButton = new JButton("Next");
            nextButton.setAlignmentX(Component.CENTER_ALIGNMENT);
            componentPanel.add(nextButton);
            
            /* Create an ActionEvent for when the "nextButton" is clicked */
            nextButton.addActionListener((ActionEvent buttonEvent) -> {
                double price;
                String input;
                try{
                if (armButton.isSelected()){
                    input = (String) JOptionPane.showInputDialog(componentPanel, "Enter the price:", "Create Arm", JOptionPane.QUESTION_MESSAGE, null, null, null);
                    if (input != null){
                        price = Double.parseDouble(input);
                        partList.add(new Arm(price));
                    }
                    
                } else if (batteryButton.isSelected()){
                    double energy, maxPower;
                    input = (String) JOptionPane.showInputDialog(componentPanel, "Enter the energy:", "Create battery", JOptionPane.QUESTION_MESSAGE, null, null, null);
                    if (input != null){
                        energy = Double.parseDouble(input);
                        input = (String) JOptionPane.showInputDialog(componentPanel, "Enter the maximum power:", "Create battery", JOptionPane.QUESTION_MESSAGE, null, null, null);
                        if (input != null){
                            maxPower = Double.parseDouble(input);
                            input = (String) JOptionPane.showInputDialog(componentPanel, "Enter the price:", "Create battery", JOptionPane.QUESTION_MESSAGE, null, null, null);
                            if (input != null){
                                price = Double.parseDouble(input);
                                partList.add(new Battery(energy, maxPower, price));
                            }
                        }
                    }
                    
                } else if (headButton.isSelected()){
                    input = (String) JOptionPane.showInputDialog(componentPanel, "Enter the price:", "Create Head", JOptionPane.QUESTION_MESSAGE, null, null, null);
                    if (input != null){
                        price = Double.parseDouble(input);
                        partList.add(new Head(price));
                    }
                    
                } else if (locomotorButton.isSelected()){
                    int maxSpeed;
                    input = (String) JOptionPane.showInputDialog(componentPanel, "Enter the maximum speed:", "Create Locomotor", JOptionPane.QUESTION_MESSAGE, null, null, null);
                    if (input != null){
                        maxSpeed = Integer.parseInt(input);
                        input = (String) JOptionPane.showInputDialog(componentPanel, "Enter the price:", "Create Locomotor", JOptionPane.QUESTION_MESSAGE, null, null, null);
                        if (input != null){
                            price = Double.parseDouble(input);
                            partList.add(new Locomotor(maxSpeed, price));
                        }
                    }
                    
                } else if (torsoButton.isSelected()){
                    int compartments, armCount, counter = 0;
                    input = (String) JOptionPane.showInputDialog(componentPanel, "Enter the number of batteries needed(must be 1 through 3 inclusive):", "Create Torso", JOptionPane.QUESTION_MESSAGE, null, null, null);
                    if (input != null){
                        compartments = Integer.parseInt(input);
                        // FIX: 
                    }
                }
                } catch (NumberFormatException n){
                   JOptionPane.showMessageDialog(componentPanel, "You've entered an incorrect value.", "Input Error", JOptionPane.ERROR_MESSAGE);
                } catch (HeadlessException h){
                   JOptionPane.showMessageDialog(componentPanel, "No mouse and/or keyboard detected.");
                }
            });
            
            componentFrame.add(componentPanel);
            componentPanel.setVisible(true);
            componentFrame.setVisible(true);
        });
        menu.add(item);
        menuBar.add(menu);
        /* Finished creating the "Create" menu */
        
        /* Begin creating the "View" menu */
        menu = new JMenu("View");
        item = new JMenuItem("Orders");
        item.addActionListener((ActionEvent event) -> {
            JFrame viewOrder = new JFrame("View Orders");
            viewOrder.setLayout(new FlowLayout());
            viewOrder.setSize(500,150);
            viewOrder.setLocationRelativeTo(window);
            
            JLabel usernamePrompt = new JLabel("Enter your username:");
            usernamePrompt.setHorizontalAlignment(SwingConstants.RIGHT);  
            viewOrder.add(usernamePrompt);
            JTextField username = new JTextField(20);
            viewOrder.add(username);
            
            username.addActionListener((ActionEvent usernameEvent) -> {
                if (findUsername(userList, username.getText()) == false){
                    JOptionPane.showMessageDialog(viewOrder, "That username is not recognized", "Name Error", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    // FIX: View Customer's Orders
                }
            });
            
            viewOrder.setVisible(true);
        });
        menu.add(item);
        item = new JMenuItem("Customers");
        item.addActionListener((ActionEvent event) -> {
            JFrame viewCustomer = new JFrame("View Customers");
            viewCustomer.setLayout(new FlowLayout());
            viewCustomer.setSize(500,150);
            viewCustomer.setLocationRelativeTo(window);
            
            for(Customer customer : userList){
                JLabel customerName = new JLabel();
                customerName.setText(customer.getName());
                // FIX: add customer info to "viewCustomer" (format GUI accordingly)
                viewCustomer.add(customerName);
            }
            viewCustomer.setVisible(true);
        });
        menu.add(item);
        item = new JMenuItem("Sales Associates");
        item.addActionListener((ActionEvent event) -> {
            JFrame viewAssociate = new JFrame("View Sales Associates");
            viewAssociate.setLayout(new FlowLayout());
            viewAssociate.setSize(500,150);
            viewAssociate.setLocationRelativeTo(window);
            
            for(SalesAssociate associate : salesAssociateList){
                JLabel associateName = new JLabel();
                associateName.setText(associate.getName());
                // FIX: add associate info to "viewAssociate" (format GUI accordingly)
                viewAssociate.add(associateName);
            }
            viewAssociate.setVisible(true);
        });
        menu.add(item);
        item = new JMenuItem("Robot Models");
        item.addActionListener((ActionEvent event) -> {
            JFrame viewModel = new JFrame("View Robot Models");
            viewModel.setLayout(new FlowLayout());
            viewModel.setSize(500,150);
            viewModel.setLocationRelativeTo(window);
            
            for(RobotModel model : modelList){
                // FIX: SHOW MODEL
            }
            viewModel.setVisible(true);
        });
        menu.add(item);
        item = new JMenuItem("Robot Components");
        item.addActionListener((ActionEvent event) -> {
            JFrame viewComponent = new JFrame("View Robot Components");
            viewComponent.setLayout(new FlowLayout());
            viewComponent.setSize(500,150);
            viewComponent.setLocationRelativeTo(window);
            
            for(RobotPart part : partList){
                // FIX: SHOW PART
            }
            viewComponent.setVisible(true);
        });
        menu.add(item);
        menuBar.add(menu);
        
        /* Place all menus with their respective menu items on "menuBar" and draw the "window" */
        window.setJMenuBar(menuBar);
        window.setVisible(true);
    }
    
    public static boolean findUsername(ArrayList<Customer> validCustomers, String testName){
        
        /* Created a for-each loop which returned true if testName was in validCustomers. The IDE recommended that I change my code to the following: */  
        return validCustomers.stream().anyMatch((customer) -> (customer.getName().equals(testName)));
    }
    
    public static boolean findAssociate(ArrayList<SalesAssociate> validAssociates, String testName){
        
        return validAssociates.stream().anyMatch((associate) -> (associate.getName().equals(testName)));
    }
}









