package com.pluralsight;

public class Room {
    private double numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;
    private boolean roomAvailable;

    public Room(double numberOfBeds, double price, boolean occupied, boolean dirty, boolean roomAvailable) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
        this.roomAvailable = roomAvailable;
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
        return this.roomAvailable;
    }

    public void setAvailable(boolean roomAvailable) {
        this.roomAvailable = roomAvailable;
    }
    public void checkedIn(){
        if (isOccupied()){
            if (!isAvailable()){
                System.out.println("Room is not available yet Sir");
            }else {
                System.out.println("The room is occupied");
            }
        }else {
            if (isDirty()){
                System.out.println("Room is dirty sending cleaning lady");
                setDirty(false);
                setOccupied(true);
                System.out.println("the room is now up to standards for check-in");
            }else {
                setOccupied(true);
                System.out.println("The room is already up to standards and ready for check-in");
            }
        }
    }
    public void checkedOut(){
        if (isOccupied()) {
            if (isDirty()) {
                System.out.println("Ill send cleaning staff");
                setDirty(false);
                System.out.println("The room is clean now");
            }
            setOccupied(false);
            setAvailable(true);
            System.out.println("The guest has checked and the room is now available");
        }else {
            System.out.println("The room is not occupied so its available");
        }
    }
}
