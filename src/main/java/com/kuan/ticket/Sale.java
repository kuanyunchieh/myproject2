package com.kuan.ticket;

import java.util.Scanner;

public class Sale {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(Station.TAIPEI_CITY,Station.TAICHUNG);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Your start station? (Taipei: 1, Taichung: 2, Kaohsiung: 3");
        int choice = Integer.parseInt(scanner.next());
        Station startstation = null;
        switch (choice){
            case 1:
                startstation = Station.TAIPEI_CITY;
                break;
            case 2:
                startstation = Station.TAICHUNG;
                break;
            case 3:
                startstation = Station.KAOHSIUNG;
                break;
        }
        System.out.println("Your destination station? (Taipei: 1, Taichung: 2, Kaohsiung: 3)");
        choice = Integer.parseInt(scanner.next());
        Station endststion = null;
        switch (choice){
            case 1:
                endststion = Station.TAIPEI_CITY;
                break;
            case 2:
                endststion = Station.TAICHUNG;
                break;
            case 3:
                endststion = Station.KAOHSIUNG;
                break;
        }

    }
}
