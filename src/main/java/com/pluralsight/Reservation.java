package com.pluralsight;

public class Reservation {
    private String  roomType;
    private double numberOfNights;
    private boolean weekEnd;
    private double reservationTotal;

    public Reservation(String roomType, double numberOdNights, boolean weekEnd) {
        this.roomType = roomType;
        this.numberOfNights = numberOdNights;
        this.weekEnd = weekEnd;
        calcReservationTotal();
    }

    public String getRoomType() {
        return this.roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getNumberOdNights() {
        return this.numberOfNights;
    }

    public void setNumberOdNights(double numberOdNights) {
        this.numberOfNights = numberOdNights;
        calcReservationTotal();
    }

    public boolean isWeekEnd() {
        return this.weekEnd;
    }

    public void setWeekEnd(boolean weekEnd) {
        this.weekEnd = weekEnd;
        calcReservationTotal();
    }

    public double getReservationTotal() {
        return this.reservationTotal;
    }

    public void calcReservationTotal(){
        double basePrice = 0.0;

        if ("king".equalsIgnoreCase(roomType)){
            basePrice = 139.00;
        } else if ("double".equalsIgnoreCase(roomType)) {
            basePrice= 124.00;
        }
        double totalPrice = basePrice * numberOfNights;
        if (weekEnd){
            totalPrice *= 1.10;
        }
        this.reservationTotal = totalPrice;
    }
}
