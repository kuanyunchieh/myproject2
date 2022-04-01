package com.kuan.sales;

import java.util.ArrayList;
import java.util.List;

public class Sales {
    public static void main(String[] args) {
        /*Customer c1 = new Customer("0001",600);
        Customer c2 = new SilverCustomer("0002",950);
        Customer c3 = new GoldenCustomer("0003",500);
        Customer c4 = new PlatinumCustomer("0004",900);
        c1.print();
        c2.print();
        c3.print();
        c4.print();*/

        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("0001",600));
        customers.add(new SilverCustomer("0002",950));
        customers.add(new GoldenCustomer("0003",500));
        customers.add(new PlatinumCustomer("0004",900));
        /*for (int i = 0; i < 4; i++) {
            customers.get(i).print();
        }*/
        for(Customer c : customers){
            c.print();
        }

    }
}
