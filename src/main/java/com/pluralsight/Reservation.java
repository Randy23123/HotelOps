package com.pluralsight;

public class Reservation {
    private String  roomType;
    private double price;
    private double numberOdNights;
    private boolean weekEnd;
    private double reservationTotal;

    public Reservation(String roomType, double price, double numberOdNights, boolean weekEnd, double reservationTotal) {
        this.roomType = roomType;
        this.price = price;
        this.numberOdNights = numberOdNights;
        this.weekEnd = weekEnd;
        this.reservationTotal = reservationTotal;
    }

    public String getRoomType() {
        return this.roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getNumberOdNights() {
        return this.numberOdNights;
    }

    public void setNumberOdNights(double numberOdNights) {
        this.numberOdNights = numberOdNights;
    }

    public boolean isWeekEnd() {
        return this.weekEnd;
    }

    public void setWeekEnd(boolean weekEnd) {
        this.weekEnd = weekEnd;
    }

    public double getReservationTotal() {
        return this.reservationTotal;
    }

    public void setReservationTotal(double reservationTotal) {
        this.reservationTotal = reservationTotal;
    }
}
