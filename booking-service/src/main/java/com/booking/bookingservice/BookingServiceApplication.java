package com.booking.bookingservice;

import java.util.Arrays;
import java.util.Random;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingServiceApplication.class, args);
	}
	
	@Bean
	CommandLineRunner demoRunner(BookingRepository bookingRepo) {
		return args -> {
			Arrays.asList("Shyam, Thor, Bruce Banner, Steve Rogers, Tony Stark, Natasha Romanoff".split(","))
			.forEach(name -> bookingRepo.save(new Booking(name, getRandomMovies(), getRandomTotalSeats())));
		};
	}
	
	private String getRandomMovies() {
		String[] movies = "Wonder Woman, Avengers - Age of Ultron, Batman vs Superman, Suicide Squad, Captain America - Civil War".split(",");
		return movies[new Random().nextInt(movies.length)];
	}
	
	private int getRandomTotalSeats() {
		return new Random().nextInt(4);
	}
}
