package com.company;

import java.util.Scanner;

public class Menu {
    boolean exitMenu = false;
    Calendar calendar = new Calendar();
    HotelManagement hotel = new HotelManagement();

    public Menu() {

        this.exitMenu = exitMenu;
        // set up calendar and hotel

    }

    public void Start() {
        int choice = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("====================");
            System.out.println("1 - Print all rooms.");
            System.out.println("2 - Reserve a room.");
            System.out.println("3 - UnReserve a room.");
            System.out.println("4 - Search for a room.");
            System.out.println("5 - Exit.");
            System.out.println("Enter your choice:");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    calendar.printCalendar();
                    break;
                case 2:
                    hotel.makingAReservationOption(calendar);
                    break;
                case 3:
                    hotel.unreserveOption(calendar);
                    break;
                case 4:
                    hotel.searchForRoomOption(calendar);
                    break;
                case 5:
                    exitMenu = true;
                    break;
                default:
                    System.out.println("No such option.");
            }

        } while (exitMenu == false);
    }
}
