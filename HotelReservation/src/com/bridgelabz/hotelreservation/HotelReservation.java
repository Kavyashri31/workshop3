package com.bridgelabz.hotelreservation;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelReservation {
	static List<Hotel> hotels = new ArrayList<>();

	public static void main(String[] args) {

		HotelReservation hotelReservation = new HotelReservation();

		hotelReservation.addHotel(new Hotel("Lakewood", 3, 110, 90));
		hotelReservation.addHotel(new Hotel("Bridgewood", 4, 160, 60));
		hotelReservation.addHotel(new Hotel("Ridgewood", 5, 220, 150));

		Rate rate = userInput();

		Hotel cheapestHotel = compareRate(rate);
		System.out.println(cheapestHotel);
	}

	private static Hotel compareRate(Rate rate) {
		int numOfDays = rate.getDays();
		Hotel cheapestHotel = null;
		double min = 99999999;
		if (rate.isWeekend()) {

			for (Hotel hotel : hotels) {
				double price = numOfDays * hotel.getRegularWeekendRate();

				if (price < min) {
					min = price;
					cheapestHotel = hotel;
				}
			}
		} else {
			for (Hotel hotel : hotels) {
				double price = numOfDays * hotel.getRegularWeekdayRate();

				if (price < min) {
					min = price;
					cheapestHotel = hotel;
				}
			}

		}

		return cheapestHotel;
	}

	private static Rate userInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter date range:");
		String dateRange = scan.next();
		scan.close();
		System.out.println(dateRange);
		String[] dates = dateRange.split(",");
		LocalDate startDate = LocalDate.parse(dates[0]);
		LocalDate endDate = LocalDate.parse(dates[1]);
		int daysBetween = (int) ChronoUnit.DAYS.between(startDate, endDate);
		boolean isWeekend = isWeekend(startDate) || isWeekend(endDate);
		return new Rate(isWeekend, daysBetween);
	}

	private void addHotel(Hotel hotel) {
		hotels.add(hotel);
	}

	public static boolean isWeekend(final LocalDate ld) {
		DayOfWeek day = DayOfWeek.of(ld.get(ChronoField.DAY_OF_WEEK));
		return day == DayOfWeek.SUNDAY || day == DayOfWeek.SATURDAY;
	}
}
