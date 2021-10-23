package com.bridgelabz.hotelreservation;

import java.util.ArrayList;
import java.util.List;

public class HotelReservation {
	List<Hotel> hotels = new ArrayList<>();

	public static void main(String[] args) {

		HotelReservation hotelReservation = new HotelReservation();

		hotelReservation.addHotel(new Hotel("Lakewood", 3, 110, 90));
		hotelReservation.addHotel(new Hotel("Bridgewood", 4, 160, 60));
		hotelReservation.addHotel(new Hotel("Ridgewood", 5, 220, 150));

	}

	private void addHotel(Hotel hotel) {
		hotels.add(hotel);
	}

}
