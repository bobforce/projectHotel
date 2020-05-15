package com.company;

import java.util.ArrayList;

public class Calendar {
    public RoomList allRooms = new RoomList();
    public ArrayList<RoomList> dayFromTheCalendar = new ArrayList<RoomList>();
    private int days = 30;

    public Calendar() {

      //  allRooms.printRooms();
        for (int i = 0; i < days; i++) {
            allRooms = new RoomList(); // vsqka staq e s unikalno id
            allRooms.defaultRoomList();
            dayFromTheCalendar.add(i, allRooms);
        }



    }

    public void printCalendar() {
        for (int i = 0; i < days; i++) {
            System.out.println("Date = "+i);
            dayFromTheCalendar.get(i).printRooms();
            System.out.println("=============");
        }

    }
}
