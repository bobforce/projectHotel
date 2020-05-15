package com.company;

import java.time.format.DateTimeFormatter;
public class Room {
    private int roomNumber;
    private int numberOfBeds;
    private boolean isFree=true;
    private String nameOfGuests = "none";

    public Room(int roomNumber, int numberOfBeds) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
    }
    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;

    }

    public Room() {
    }

    public String getNameOfGuests() {
        return nameOfGuests;
    }

    public void setNameOfGuests(String nameOfGuests) {
        this.nameOfGuests = nameOfGuests;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }
}
