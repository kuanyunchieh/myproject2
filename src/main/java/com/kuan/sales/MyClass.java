package com.kuan.sales;

public class MyClass implements MyInterface{
    public void print(){
        System.out.println("Print!!");
    }
    public int max(int a, int b) {
        return 1;
    }
    @Override
    public int min(int c, int d) {
        return 0;
    }
}
