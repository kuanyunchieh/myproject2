package com.kuan.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {
    public static void main(String[] args) {
        //Graphical User Interface
        //swing.JavaFX
        //extension
        JFrame frame = new JFrame();
        frame.setSize(400,300);
        frame.setLocation(200,200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //add Component
        JButton button = new JButton("OK");
        //匿名類別 Anonymous class
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello!");
            }
        });
        //MyActionListener listener = new MyActionListener();
        //button.addActionListener(listener);
        frame.setLayout(new FlowLayout());
        //frame.setLayout(new BorderLayout());
        frame.add(button);
        //frame.add(new JButton("Testing"));

        frame.setVisible(true);
        System.out.println("END?");
    }
}
