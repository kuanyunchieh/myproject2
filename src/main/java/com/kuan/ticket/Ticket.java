package com.kuan.ticket;

import java.util.Scanner;

public class Ticket {
    public static final int TAIPEI_CITY = 100;
    public static final int TAICHUNG_CITY = 200;
    public static final int KAOHSIUNG_CITY = 300;

    Station start;
    Station destination;
    int price;
    int num;
    public Ticket(Station start,Station destination){
        this.start = start;
        this.destination = destination;


        if((start==Station.TAIPEI_CITY && destination==Station.TAICHUNG)
                || (start==Station.TAICHUNG && destination==Station.TAIPEI_CITY)){
            price=600;


        }else if((start==Station.TAICHUNG && destination==Station.KAOHSIUNG)
                || (start==Station.KAOHSIUNG && destination==Station.TAICHUNG)){
            price=900;

        }else
        {
            price=1500;
        }

    }
    public void print() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int num = Integer.parseInt(s);
        price = price*num;
        System.out.println("startstation: "+ start.name + "\t" +"endstation: "+destination.name
                + "\t" +"pieces: "+ num +"\t" +"totalprice: "+price );
    }

}
