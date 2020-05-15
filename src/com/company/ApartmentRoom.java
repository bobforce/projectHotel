package com.company;

public class ApartmentRoom extends Room {
    public ApartmentRoom(int roomNumber) {
        super(roomNumber, 4);
        this.setNumberOfBeds(4);
    }
}
