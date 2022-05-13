package com.kuan.ticket2;

import java.util.Scanner;

public class Taster {
    public static void main(String[] args) {
        Ticket2 ticket = new Ticket2(
                Station2.TAIPEI_CITY,
                Station2.KAOHSIUNG
        );
//        System.out.println(ticket.start.name);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your start station? (Taipei: 1, Taichung: 2, Kaohsiung: 3");
        int choice = Integer.parseInt(scanner.next());
        Station2 startStation = null;
        switch (choice) {
            case 1:
                startStation = Station2.TAIPEI_CITY;
                break;
            case 2:
                startStation = Station2.TAICHUNG;
                break;
            case 3:
                startStation = Station2.KAOHSIUNG;
                break;
        }
        System.out.println("Your destination station? (Taipei: 1, Taichung: 2, Kaohsiung: 3)");
        choice = Integer.parseInt(scanner.next());
        Station2 endStation = null;
        switch (choice) {
            case 1:
                endStation = Station2.TAIPEI_CITY;
                break;
            case 2:
                endStation = Station2.TAICHUNG;
                break;
            case 3:
                endStation = Station2.KAOHSIUNG;
                break;
        }
        Ticket2 t = new Ticket2(startStation, endStation);
        System.out.println(t.price);
        //what type of ticket?
        //how many tickets?
        //loop?
    }
}
