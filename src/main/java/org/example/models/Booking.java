package org.example.models;

import java.time.LocalDateTime;

public class Booking {

    public Booking()
    {

    }

    public Booking(int id, String name,
                   String userName, String phoneNumber,
                   String destination, String departure,
                   double price, String url, LocalDateTime createdDate,
                   int maxSlot) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.destination = destination;
        this.departure = departure;
        this.price = price;
        this.url = url;
        this.createdDate = createdDate;
        this.maxSlot = maxSlot;
    }

    private int id;
    private String name;
    private String userName;
    private String phoneNumber;
    private String destination;
    private String departure;
    private double price;
    private String url;
    private LocalDateTime createdDate;
    private  int maxSlot;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public int getMaxSlot() {
        return maxSlot;
    }

    public void setMaxSlot(int maxSlot) {
        this.maxSlot = maxSlot;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", destination='" + destination + '\'' +
                ", departure='" + departure + '\'' +
                ", price=" + price +
                ", url='" + url + '\'' +
                ", createdDate=" + createdDate +
                ", maxSlot=" + maxSlot +
                '}';
    }
}
