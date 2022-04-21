package com.kuan.ticket;

public class Total {
    int prices;
    public Total(int prices){
        this.prices = prices;
    }
    public void print(){
        System.out.println(prices++);
    }
}
