package com.company;

import java.util.ArrayList;

public class RoomList {
    ArrayList<Room> roomList = new ArrayList<>();


    public RoomList(ArrayList<Room> roomList) {
        this.roomList = roomList;
        this.defaultRoomList();
    }

    public RoomList() {
        this.roomList = roomList;
    }

    public ArrayList<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(ArrayList<Room> roomList) {
        this.roomList = roomList;
    }

    public void defaultRoomList() {
        roomList.add(new SingleRoom(101));
        roomList.add(new DoubleRoom(102));
        roomList.add(new ApartmentRoom(103));

    }

    public void printRooms() {
        String freeStatus = "";
        for (Room room : roomList) {

            if (room.isFree()) {
                freeStatus = "free";
            } else {
                freeStatus = "occupied";
            }

            System.out.println(/*room + */" Number:" + room.getRoomNumber() + " Beds:" + room.getNumberOfBeds() + " Status:" + freeStatus/*room.isFree()*/ + " Guests:" + room.getNameOfGuests());

        }

    }
}
