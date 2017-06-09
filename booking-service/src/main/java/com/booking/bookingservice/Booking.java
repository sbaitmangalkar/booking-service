package com.booking.bookingservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Booking {
	@Id
	@GeneratedValue
	private long id;
	private String bookingName;
	private String movie;
	private int totalSeats;
	
	public Booking() {
		
	}
	
	public Booking(String bookingName, String movie, int totalSeats) {
		this.bookingName = bookingName;
		this.movie = movie;
		this.totalSeats = totalSeats;
	}

	public long getId() {
		return id;
	}

	public String getBookingName() {
		return bookingName;
	}

	public String getMovie() {
		return movie;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", bookingName=" + bookingName + ", movie=" + movie + ", totalSeats=" + totalSeats
				+ "]";
	}
}
