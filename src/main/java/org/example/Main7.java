package org.example;

import org.example.models.Booking;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Main7 {

    public static void main(String[] args) {
        List<Booking> bookingList= new ArrayList<>();
        for(int i = 0;i<10;i++){
            Booking booking = new Booking();
            booking.setId(i);
            booking.setName("Ha Noi - Phu Quoc");
            booking.setDeparture("Ha Noi - San bay noi bai");
            booking.setDestination("HCM - San bay Tan Son Nhat");
            booking.setPrice(200000);
            booking.setMaxSlot(10);
            booking.setUserName("Dinh Van Dong");
            booking.setPhoneNumber("0965741051");
            booking.setUrl("");
            booking.setCreatedDate(LocalDateTime.now());
            bookingList.add(booking);
        }
        for(Booking b: bookingList){

            System.out.println(b.toString());
        }

    }
}
