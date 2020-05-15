package com.company;

import java.util.Scanner;

public class HotelManagement {
    Scanner input = new Scanner(System.in);
    int startDate;
    int endDate;
    int desiredRoom;
    String guestName;
    int requiredNumberOfBeds;

    public Calendar makingAReservationOption(Calendar calendar) {

        collectData();

        if (isTheRoomFreeAllOfTheDays(calendar, startDate, endDate)) {
            reserveTheRoom(calendar, startDate, endDate, guestName);
        } else {
            System.out.println("The room isnt free in all of desired dates.");
        }
        return calendar;
    }

    public void collectData() {
        System.out.println("Enter start date(0-29)");
        startDate = input.nextInt();
        System.out.println("Enter end date(0-29)");
        endDate = input.nextInt();
        System.out.println("Enter desired room number (101-103):");
        desiredRoom = input.nextInt();
        System.out.println("Enter name of Guests:");
        input.nextLine();
        guestName = input.nextLine();

    }

    public void collectSearchData() {
        System.out.println("Enter start date(0-29)");
        startDate = input.nextInt();
        System.out.println("Enter end date(0-29)");
        endDate = input.nextInt();
        System.out.println("Enter number of beds");
        requiredNumberOfBeds = input.nextInt();

    }

    public Calendar reserveTheRoom(Calendar calendar, int startDate, int endDate, String nameOfGuests) {
        for (int i = startDate; i <= endDate; i++) {
          //  System.out.println(calendar.allRooms.roomList.size());
            for (int j = 0; j < calendar.allRooms.roomList.size(); j++) {
                if (calendar.allRooms.roomList.get(j).getRoomNumber() == (desiredRoom)) {


                    calendar.dayFromTheCalendar.get(i).roomList.get(j).setFree(false);
                    calendar.dayFromTheCalendar.get(i).roomList.get(j).setNameOfGuests(nameOfGuests);

                }
            }
        }
        return calendar;


    }
    public void unreserveOption(Calendar calendar){
        collectUnreserveData();
        unreserveRoom(calendar,startDate,endDate,desiredRoom);
    }
    public void collectUnreserveData() {
        System.out.println("Enter start date(0-29)");
        startDate = input.nextInt();
        System.out.println("Enter end date(0-29)");
        endDate = input.nextInt();
        System.out.println("Enter the number of the room");
        desiredRoom = input.nextInt();

    }
    public Calendar unreserveRoom(Calendar calendar, int startDate, int endDate, int desiredRoom) {
        for (int i = startDate; i <= endDate; i++) {
            System.out.println(calendar.allRooms.roomList.size());
            for (int j = 0; j < calendar.allRooms.roomList.size(); j++) {
                if (calendar.allRooms.roomList.get(j).getRoomNumber() == (desiredRoom)) {


                    calendar.dayFromTheCalendar.get(i).roomList.get(j).setFree(true);
                    calendar.dayFromTheCalendar.get(i).roomList.get(j).setNameOfGuests("none");

                }
            }
        }
        return calendar;


    }

    public boolean isTheRoomFreeAllOfTheDays(Calendar calendar, int startDate, int endDate) {
        boolean theRoomIsTotallyFree = true;

        for (int i = startDate; i <= endDate; i++) {
            for (int j = 0; j < calendar.allRooms.roomList.size(); j++) {
                if (calendar.dayFromTheCalendar.get(i).roomList.get(j).isFree() == (false)) {
                    theRoomIsTotallyFree = false;
                    System.out.println("THE ROOM ISNT FREE ALL THE DAYS");
                }
            }

        }
       // System.out.println("Ther Rooom is totally free");
        return theRoomIsTotallyFree;
    }

    public void searchForRoomOption(Calendar calendar) {
        collectSearchData();
        searchForRoom(calendar, startDate, endDate, requiredNumberOfBeds);
    }

    public void searchForRoom(Calendar calendar, int startDate, int endDate, int numberOfBeds) {
        System.out.println("==============================================");

        System.out.println("Currently free rooms matching your parameters:");

        for (int i = startDate; i <= endDate; i++) {
            for (int j = 0; j < calendar.allRooms.roomList.size(); j++) {
                if (calendar.dayFromTheCalendar.get(i).roomList.get(j).isFree() == (true) && calendar.dayFromTheCalendar.get(i).roomList.get(j).getNumberOfBeds() == numberOfBeds) {
                    printFoundRoom(calendar, i, j);
                }
            }

        }
    }

    public void printFoundRoom(Calendar calendar, int i, int j) {
        System.out.println("Day:" + i + " Room : " + calendar.dayFromTheCalendar.get(i).roomList.get(j).getRoomNumber() + " Beds:" + calendar.dayFromTheCalendar.get(i).roomList.get(j).getNumberOfBeds() + " Free :" + calendar.dayFromTheCalendar.get(i).roomList.get(j).isFree());

    }
}
