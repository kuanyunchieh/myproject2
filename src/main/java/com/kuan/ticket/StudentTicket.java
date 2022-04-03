package com.kuan.ticket;

public class StudentTicket extends Ticket {
    public StudentTicket(Station start,Station destination,int num,Types type){
        super(start,destination,num,type);
        price= (int) (price*0.8);
    }
}
