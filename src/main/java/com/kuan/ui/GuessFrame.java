package com.kuan.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame {
    //Fields
    //Constructors
    public GuessFrame(){
        super();//一定要在第一行
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JButton button = new JButton("Hi");
        JLabel label = new JLabel("www");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Hello");
                label.setText("Ohla!!!");
            }
        });
        setLayout(new FlowLayout());
        add(label);
        add(button);
        setVisible(true);

    }
    //Methods

    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
    }



}
