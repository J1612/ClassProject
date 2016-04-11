/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project_gui;

import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BorderFactory;

/**
 *
 * @author Shaun
 */
public class OOP_project_GUI {

    public static final int MENU_NUM = 6;
    
    public static void main(String[] args) {
        
        int i;
        int x_pos = 0;
        int y_pos = 0;
        int labelWidth = 60;
        int labelHeight = 30;
        
        JFrame window = new JFrame("Robbie Robot Shop");
        window.setLayout(new FlowLayout(FlowLayout.LEFT)); // Every component on this frame will be left-aligned
        window.setSize(800,500);
        window.setLocationRelativeTo(null); // Shows 'window' on the center of the screen
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        
        /* Create an array of menu labels */
        JLabel label[] = new JLabel[MENU_NUM];
        
        /* Create the menu labels */
        JLabel fileLabel = new JLabel("File", JLabel.CENTER);
        JLabel editLabel = new JLabel("Edit", JLabel.CENTER);
        JLabel createLabel = new JLabel("Create", JLabel.CENTER);
        JLabel viewLabel = new JLabel("View", JLabel.CENTER);
        JLabel toolLabel = new JLabel("Tools", JLabel.CENTER);
        JLabel helpLabel = new JLabel("Help", JLabel.CENTER);
        
        /* Add the menu labels to the JLabel array */
        label[0] = fileLabel;
        label[1] = editLabel;
        label[2] = createLabel;
        label[3] = viewLabel;
        label[4] = toolLabel;
        label[5] = helpLabel;
        
        /* Give each label a specific location, size, and border. Once done, add it to the "window" JFrame */
        for (i = 0; i < MENU_NUM; i++){
            label[i].setBounds(x_pos, y_pos, labelWidth, labelHeight);
            label[i].setPreferredSize(new Dimension(labelWidth, labelHeight)); // The GUI will try to keep the labels at a specific size
            label[i].setBorder(BorderFactory.createLineBorder(Color.black));
            label[i].setVisible(true);
            window.add(label[i]);
            
            x_pos += labelWidth + 1; //prevent overlapping elements by changing the x-position to be 1 pixel greater than the width of the label every iteration of the loop
        }
    }
    
}
