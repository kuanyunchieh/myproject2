package com.kuan.sales;

public class PlatinumCustomer extends GoldenCustomer{

    public PlatinumCustomer(String id,int amount){
        super(id, amount);
    }

    @Override
    public int getOffMoney() {
        return (int) (amount*0.7);
    }

    @Override
    public int getReturnMoney() {
        return (int) (amount*0.2f);
    }
}
