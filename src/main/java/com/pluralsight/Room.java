package com.pluralsight;

public class Room {
    private double numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;
    private boolean available;

    public Room(double numberOfBeds, double price, boolean occupied, boolean dirty, boolean available) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
        this.available = available;
    }


    public double getNumberOfBeds() {
        return this.numberOfBeds;
    }

    public void setNumberOfBeds(double numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return this.occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean isDirty() {
        return this.dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public boolean isAvailable() {
        return this.available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
