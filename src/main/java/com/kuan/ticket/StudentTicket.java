package com.kuan.ticket;

public class StudentTicket extends Ticket {
    public StudentTicket(Station start,Station destination){
        super(start,destination);
        price= (int) (price*0.8);
    }
}
