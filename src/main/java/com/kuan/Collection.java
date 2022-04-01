package com.kuan;

import java.util.ArrayList;
import java.util.List;

public class Collection {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(4);
        int n1 = list.get(0);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(n1);

        List list1 = new ArrayList();
        list1.add(15);
        list1.add("abc");
        list1.add(true);
        int a1 = (int)list1.get(0);
        String a2 = (String) list1.get(1);
        boolean a3 = (boolean)list1.get(2);
        System.out.println(a2);
        System.out.println(a3);
    }
}
