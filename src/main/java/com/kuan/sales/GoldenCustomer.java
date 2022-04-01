package com.kuan.sales;

public class GoldenCustomer extends SilverCustomer{

    public GoldenCustomer(String id,int amount){
        super(id, amount);
    }

    @Override
    public int getOffMoney() {
        return (int) (amount*0.9);
    }
}
