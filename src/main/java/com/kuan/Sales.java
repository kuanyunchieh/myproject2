package com.kuan;

public class Sales {
    public static void main(String[] args) {
        Customer c1 = new Customer("0001",1500);
        SilverCustomer c2 = new SilverCustomer("0002",5000);
        c1.print();
        c2.print();
    }
}
