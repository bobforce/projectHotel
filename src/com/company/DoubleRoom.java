package com.company;

public class DoubleRoom extends Room{
    public DoubleRoom(int roomNumber) {
        super(roomNumber, 2);
        this.setNumberOfBeds(2);
    }
}
