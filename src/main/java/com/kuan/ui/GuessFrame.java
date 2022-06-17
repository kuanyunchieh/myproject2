package com.kuan.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessFrame extends JFrame {
    //Fields
    JButton button = new JButton("GUESS");
    JLabel label = new JLabel("???");
    JTextField number = new JTextField(10);
    Random random = new Random();
    int secret = random.nextInt(10)+1;
    //Constructors
    public GuessFrame(){
        super();//一定要在第一行
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        System.out.println("Secret: "+secret);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Hello");
                //label.setText("Ohla!!!");
                int num = Integer.parseInt(number.getText());
                System.out.println(num);
                if(num > secret){
                    label.setText("Smaller");
                }else if(num<secret){
                    label.setText("Bigger");
                }else {
                    label.setText("Bingo!! the answer is "+num);
                    System.out.println("End");
                }
            }
        });
        setLayout(new FlowLayout());
        add(number);
        add(button);
        add(label);
        setVisible(true);

    }
    //Methods

    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
    }



}
