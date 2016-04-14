/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project_gui;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.util.ArrayList;

/**
 *
 * @author Shaun
 */
public class OOP_project_GUI {
    
    public static void main(String[] args) {
        
        ArrayList<String> userList = new ArrayList();
        ArrayList<String> salesAssociateList = new ArrayList();
        
        JFrame window = new JFrame("Robbie Robot Shop");
        window.setLayout(new FlowLayout());
        window.setSize(800, 500);
        window.setLocationRelativeTo(null); // Have the JFrame appear on the center of the monitor
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        /* Create a menu bar and have several drop-down menus (File, Create, etc.) containing their respective items */
        JMenuBar menuBar = new JMenuBar();
        
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
                if (findName(userList, username.getText()) == false){
                    JOptionPane.showMessageDialog(orderWindow, "That username is not recognized", "Name Error", JOptionPane.ERROR_MESSAGE);
                }
            });
            
            /* Create an ActionListener for associate */
            associate.addActionListener((ActionEvent associateEvent) -> {
                if (findName(salesAssociateList, username.getText()) == false){
                    JOptionPane.showMessageDialog(orderWindow, "That person is not employed as a Sales Associate", "Name Error", JOptionPane.ERROR_MESSAGE);
                }
            });
            
            /* Create a "Next" button for the user to move on */
            JButton nextButton = new JButton("Next");
            nextButton.setVisible(true);
            orderWindow.add(nextButton);
            
            //FIX: ADD LISTENER FOR BUTTON
            
            orderWindow.setVisible(true);
        });
        menu.add(item);
        item = new JMenuItem("Customer");
        item.addActionListener((ActionEvent event) -> {
            String inputName = JOptionPane.showInputDialog(window, "Enter your username:");
            userList.add(inputName);
            JOptionPane.showMessageDialog(window, "You were successfully added!", "Username Added", JOptionPane.INFORMATION_MESSAGE);
        });
        menu.add(item);
        item = new JMenuItem("Sales Associate");
        item.addActionListener((ActionEvent event) -> {
            String inputName = JOptionPane.showInputDialog(window, "Enter your full name:");
            salesAssociateList.add(inputName);
            JOptionPane.showMessageDialog(window, "You were successfully added!", "Employee Added", JOptionPane.INFORMATION_MESSAGE);
        });
        menu.add(item);
        item = new JMenuItem("Robot Model");
        menu.add(item);
        item = new JMenuItem("Robot Component");
        menu.add(item);
        menuBar.add(menu);
        
        menu = new JMenu("View");
        item = new JMenuItem("Orders");
        menu.add(item);
        item = new JMenuItem("Customers");
        menu.add(item);
        item = new JMenuItem("Sales Associates");
        menu.add(item);
        item = new JMenuItem("Robot Models");
        menu.add(item);
        item = new JMenuItem("Robot Components");
        item.addActionListener((ActionEvent event) -> {
            JDialog viewComponent = new JDialog(window, "View Robot Components");
            viewComponent.setSize(300,300);
            viewComponent.setLocationRelativeTo(window);
            viewComponent.setVisible(true);
        });
        menu.add(item);
        menuBar.add(menu);
        
        /* Place all menus with their respective menu items on "menuBar" and draw the "window" */
        window.setJMenuBar(menuBar);
        window.setVisible(true);
    }
    
    public static boolean findName(ArrayList<String> validNames, String testName){
        
        /* Created a for-each loop which returned true if testName was in validNames. The IDE recommended to change my code to the following: */
        return validNames.stream().anyMatch((name) -> (name.equals(testName)));
    }
    
}
