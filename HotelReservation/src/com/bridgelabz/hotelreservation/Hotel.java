package com.bridgelabz.hotelreservation;

public class Hotel {

	private String name;
	private int rating;
	private String customerType;
	private double regularWeekdayRate;
	private double regularWeekendRate;

	// private double rewardsWeekdayRate;
	// private double rewardsWeekendRate;

	public Hotel() {
	}

	/**
	 * @param name
	 * @param rating
	 * @param customerType
	 * @param weekdayRate
	 * @param weekendRate
	 */
	public Hotel(String name, int rating, double weekdayRate, double weekendRate) {
		this.name = name;
		this.rating = rating;
		this.regularWeekdayRate = weekdayRate;
		this.regularWeekendRate = weekendRate;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the customerType
	 */
	public String getCustomerType() {
		return customerType;
	}

	/**
	 * @param customerType the customerType to set
	 */
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	/**
	 * @return the regularWeekdayRate
	 */
	public double getRegularWeekdayRate() {
		return regularWeekdayRate;
	}

	/**
	 * @param regularWeekdayRate the regularWeekdayRate to set
	 */
	public void setRegularWeekdayRate(double regularWeekdayRate) {
		this.regularWeekdayRate = regularWeekdayRate;
	}

	/**
	 * @return the regularWeekendRate
	 */
	public double getRegularWeekendRate() {
		return regularWeekendRate;
	}

	/**
	 * @param regularWeekendRate the regularWeekendRate to set
	 */
	public void setRegularWeekendRate(double regularWeekendRate) {
		this.regularWeekendRate = regularWeekendRate;
	}

	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

}
