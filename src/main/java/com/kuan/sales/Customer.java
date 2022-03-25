package com.kuan.sales;

public class Customer {
    String id;
    int amount;
    int money;
    float off = 0.1f;

    public Customer(String id,int amount){
        this.id = id;
        this.amount = amount;
    }
    public Customer(){

    }
    public int getOffMoney(){
        int discount = (amount/1000)*100;
         return  amount-discount;
    }

    public void print(){
        System.out.println(id + "\t" + amount + "\t" + getOffMoney());
    }

}
