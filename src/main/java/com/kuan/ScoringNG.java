package com.kuan;

public class ScoringNG {
    public static void main(String[] args) {
        int [] english = {90,80,70};
        int [] math = {89,96,74};
        String [] name = {"Tony","Nick","Anna"};
        for (int i = 0; i < 3; i++) {
            System.out.println(name[i] + "\t" + english[i] + "\t" + math[i] + "\t" +(english[i]+math[i])/2);
        }
    }
}
