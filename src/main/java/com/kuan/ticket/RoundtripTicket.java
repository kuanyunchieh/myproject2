package com.kuan.ticket;

import java.util.Scanner;

public class RoundtripTicket extends Ticket{
    public RoundtripTicket(Station start,Station destination) {
        super(start, destination);
        price = (int)((price*2)*0.9);
    }
    public void print(){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int num = Integer.parseInt(s);
        price = price*num;
        System.out.println("startstation: "+ start.name + "\t" +"endstation: "+destination.name+"\n"+"&"+"\n"
                +"startstation: "+ destination.name + "\t" +"endstation: "+start.name
                +"\t" +"pieces: "+ num +"\t" +"totalprice: "+price );
    }
}
