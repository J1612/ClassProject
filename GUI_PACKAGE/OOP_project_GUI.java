/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project_gui;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;



/**
 *
 * @author Shaun
 */
public class OOP_project_GUI {
    
//    public static int NUM_FILE_ITEMS = 4;
//    public static int NUM_EDIT_ITEMS = 4;
//    public static int NUM_CREATE_ITEMS = 5;
//    public static int NUM_VIEW_ITEMS = 5;
//    public static int NUM_TOOL_ITEMS = 0; // implement if enough time
//    public static int NUM_HELP_ITEMS = 0; // implement if enough time
    
    public static void main(String[] args) {
        
//        JMenuItem[] fileItems = new JMenuItem[NUM_FILE_ITEMS];
//        JMenuItem[] editItems = new JMenuItem[NUM_EDIT_ITEMS];
//        JMenuItem[] createItems = new JMenuItem[NUM_CREATE_ITEMS];
//        JMenuItem[] viewItems = new JMenuItem[NUM_VIEW_ITEMS];
        
        JFrame window = new JFrame("Robbie Robot Shop");
        window.setLayout(new FlowLayout());
        window.setSize(800, 500);
        window.setLocationRelativeTo(null); // Have the JFrame appear on the center of the monitor
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        /* Create a menu bar and have the first drop-down menu be "File" with its respective items */
        JMenuBar menuBar = new JMenuBar();
        
        JMenu menu = new JMenu("File");
        JMenuItem item = new JMenuItem("New Shop");
        menu.add(item);        
        item = new JMenuItem("Load Shop");
        menu.add(item);
        item = new JMenuItem("Save Shop");
        menu.add(item);
        menuBar.add(menu);
        
        menu = new JMenu("Create");
        item = new JMenuItem("Order");
        menu.add(item);
        item = new JMenuItem("Customer");
        menu.add(item);
        item = new JMenuItem("Sales Associate");
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
        menu.add(item);
        menuBar.add(menu);
        
        window.setJMenuBar(menuBar);
        window.setVisible(true);
    }
    
}
