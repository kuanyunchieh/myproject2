package com.kuan.ticket;

import java.util.Scanner;

public class Ticket {
    public static final int TAIPEI_CITY = 100;
    public static final int TAICHUNG_CITY = 200;
    public static final int KAOHSIUNG_CITY = 300;

    Station start;
    Station destination;
    Types type;

    int price;
    int num;


    public Ticket(Station start,Station destination,int num,Types type){
        this.start = start;
        this.destination = destination;
        this.num = num;
        this.type=type;

        if(start==Station.TAIPEI_CITY){
            if(destination==Station.TAICHUNG){
                price=600;
            }else if(destination == Station.KAOHSIUNG){
                price=1500;
            }else {
                System.out.println("Wrong");
            }
        }else if(start ==Station.TAICHUNG){
            if(destination==Station.TAIPEI_CITY){
                price=600;
            }else if(destination==Station.KAOHSIUNG){
                price=900;
            }else {
                System.out.println("Wrong");
            }
        }else if(start==Station.KAOHSIUNG){
            if(destination==Station.TAIPEI_CITY){
                price=1500;
            }else if(destination==Station.TAICHUNG){
                price=900;
            }else {
                System.out.println("Wrong");
            }
        }

    }
    public void print() {
        price = price*num;
        System.out.println("Startstation: "+ start.name + "\t" +"Endstation: "+destination.name
                + "\t" +"Type: "+type.types+ "\t" +"Pieces: "+ num +"\t" +"price: "+price );
    }

}
