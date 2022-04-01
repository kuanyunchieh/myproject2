package com.kuan.ticket;

import java.util.Scanner;
//台北到台中600
//台北到高雄1500
//高雄到台中900
//學生證8折/敬老票5折/來回票9折
public class Sale {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(Station.TAIPEI_CITY,Station.TAICHUNG);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Your start station? (Taipei: 1, Taichung: 2, Kaohsiung: 3)");
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
        Station endstation = null;
        switch (choice){
            case 1:
                endstation = Station.TAIPEI_CITY;
                break;
            case 2:
                endstation = Station.TAICHUNG;
                break;
            case 3:
                endstation = Station.KAOHSIUNG;
                break;
        }

    }
}
