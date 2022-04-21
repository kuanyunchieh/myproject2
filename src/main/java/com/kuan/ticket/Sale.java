package com.kuan.ticket;

import com.kuan.sales.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//台北到台中600
//台北到高雄1500
//高雄到台中900
//學生證8折/敬老票5折/來回票9折
public class Sale {
    public static void main(String[] args) {
        //Ticket ticket = new Ticket(Station.TAIPEI_CITY,Station.TAICHUNG);
        List <Ticket> tickets = new ArrayList<Ticket>();
        List <Total>totals = new ArrayList();
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
            System.out.println("How many pieces you want?");
            int pieces = Integer.parseInt(scanner.next());

            System.out.println("Your Ticket type ? (Normal: 1, Student: 2, Older: 3 ,Round-trip: 4)");
            choice = Integer.parseInt(scanner.next());
            int sum = 0;
            Ticket price = null;
            Types type = null;
            switch (choice) {
                case 1:
                    type=Types.Normal;
                    price = new Ticket(startstation, endstation,pieces,type);
                    tickets.add(new Ticket(startstation,endstation,pieces,type));

                    break;
                case 2:
                    type=Types.Student;
                    price = new StudentTicket(startstation,endstation,pieces,type);
                    tickets.add(new StudentTicket(startstation,endstation,pieces,type));

                    break;
                case 3:
                    type=Types.Older;
                    price = new OlderTicket(startstation,endstation,pieces,type);
                    tickets.add(new OlderTicket(startstation,endstation,pieces,type));

                    break;
                case 4:
                    type=Types.RoundTrip;
                    price = new RoundtripTicket(startstation,endstation,pieces,type);
                    tickets.add(new RoundtripTicket(startstation,endstation,pieces,type));

                    break;

            }
            System.out.println("Want to buy another tickets?(Yes: 1, No: 2 ,Cancle order: 3)");
            choice = Integer.parseInt(scanner.next());
            switch (choice){
                case 1:
                    break;
                case 2:
                    for(Ticket t: tickets){
                        t.print();
                    }

                    end = true;
                    break;
                case 3:
                    end = true;
                default:
                    System.out.println("Wrong");
                    break;
            }
        }
        System.out.println("Thank you.looking forward to serving you again");
    }
}
