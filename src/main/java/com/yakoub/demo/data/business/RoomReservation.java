package com.yakoub.demo.data.business;

import java.util.Date;

public class RoomReservation {
    private long roomId;
    private long guestId;
    private String roomName;
    private String roomNumber;
    private String firstName;
    private String lastName;

    private Date date;

    public RoomReservation() {
    }

    public RoomReservation(long roomId, long guestId, String roomName, String roomNumber, String firstName, String lastName) {
        this.roomId = roomId;
        this.guestId = guestId;
        this.roomName = roomName;
        this.roomNumber = roomNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public long getGuestId() {
        return guestId;
    }

    public void setGuestId(long guestId) {
        this.guestId = guestId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "RoomReservation{" +
                "roomId=" + roomId +
                ", guestId=" + guestId +
                ", roomName='" + roomName + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", date=" + date +
                '}';
    }
}
