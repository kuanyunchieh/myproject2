package com.kuan.ticket2;

public class Ticket2 {
    /*public static final int TAIPEI_CITY = 100;
    public static int TAICHUNG_CITY = 200;
    public static int KAOHSIUNG_CITY = 400;*/

    int price;
    Station2 start;
    Station2 destination;
    public Ticket2(Station2 start, Station2 destination) {
        this.start = start;
        this.destination = destination;
        int diff = Math.abs(start.id - destination.id);
//        System.out.println(diff);
        switch (diff) {
            case 100:
                price = 500;
                break;
            case 200:
                price = 600;
                break;
            case 300:
                price = 1100;
                break;
        }

        /*if (start == Station.TAIPEI_CITY) {
            if (destination ==  Station.TAICHUNG) {
                price = 500;
            } else {
                price = 1100;
            }
        } else if (start == Station.TAICHUNG) {
            if (destination == Station.KAOHSIUNG) {
                price = 600;
            } else {
                price = 500;
            }
        } else if (start == Station.KAOHSIUNG) {
            if (destination == Station.TAIPEI_CITY) {
                price = 110;
            } else {
                price = 600;
            }
        }*/
    }

    public void print() {
//        taipeiCity = 100;
    }
}
