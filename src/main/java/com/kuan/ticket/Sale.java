package com.kuan.ticket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//台北到台中600
//台北到高雄1500
//高雄到台中900
//學生證8折/敬老票5折/來回票9折
public class Sale {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(Station.TAIPEI_CITY,Station.TAICHUNG);
        Scanner scanner = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Your start station? (Taipei: 1, Taichung: 2, Kaohsiung: 3)");
            int choice = Integer.parseInt(scanner.next());
            Station startstation = null;
            switch (choice) {
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
            switch (choice) {
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
            System.out.println("Your Ticket type ? (Normal: 1, Student: 2, Older: 3 ,Round-trip: 4)");
            choice = Integer.parseInt(scanner.next());
            Ticket price = null;
            switch (choice) {
                case 1:
                    price = new Ticket(startstation, endstation);
                    break;
                case 2:
                    price = new StudentTicket(startstation,endstation);
                    break;
                case 3:
                    price = new OlderTicket(startstation,endstation);
                    break;
                case 4:
                    price = new RoundtripTicket(startstation,endstation);
                    break;
            }
            System.out.println("how many tickets you want?");
            price.print();

            System.out.println("Want to buy another tickets?(Yes: 1, No: 2)");
            choice = Integer.parseInt(scanner.next());
            switch (choice){
                case 1:
                    break;
                case 2:
                    end = true;
                    break;
            }
        }
        System.out.println("Thank you.looking forward to serving you again");
    }
}
