package com.bridgelabz.hotelreservation;

public class Rate {

	private boolean isWeekend;
	private int days;
	private double price;

	/**
	 * @param isWeekend
	 * @param days
	 * @param price
	 */
	public Rate(boolean isWeekend, int days) {
		this.isWeekend = isWeekend;
		this.days = days;
	}

	/**
	 * @return the isWeekend
	 */
	public boolean isWeekend() {
		return isWeekend;
	}

	/**
	 * @param isWeekend the isWeekend to set
	 */
	public void setWeekend(boolean isWeekend) {
		this.isWeekend = isWeekend;
	}

	/**
	 * @return the days
	 */
	public int getDays() {
		return days;
	}

	/**
	 * @param days the days to set
	 */
	public void setDays(int days) {
		this.days = days;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

}
