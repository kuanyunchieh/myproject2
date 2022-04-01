package com.kuan.ticket;

public class OlderTicket extends Ticket{
    public OlderTicket(Station start,Station destination){
        super(start, destination);
        price = (int) (price*0.5f);
    }
}
