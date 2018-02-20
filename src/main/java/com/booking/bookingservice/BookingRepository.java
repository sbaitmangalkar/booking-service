package com.booking.bookingservice;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * JPARepository implementation
 * 
 * @author Shyam | catch.shyambaitmangalkar@gmail.com
 *
 */
@RepositoryRestResource
public interface BookingRepository extends JpaRepository<Booking, Long>{
	Booking findById(@Param("id") long id);
	Booking findByBookingName(@Param("bookingName") String bookingName);
	Collection<Booking> findByMovie(@Param("movie") String movie);
}
