package com.kuan.ticket;

public class OlderTicket extends Ticket{
    public OlderTicket(Station start,Station destination,int num,Types type){
        super(start, destination,num,type);
        price = (int) (price*0.5f);
    }
}
