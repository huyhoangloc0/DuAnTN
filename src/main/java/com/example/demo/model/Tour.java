package com.example.demo.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Tour")
public class Tour implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tour_id;

    private String tour_name;
    private String description;
    private Double price;
    private String start_date;
    private String end_date;
    private String destination;
    private String hotel_name;
    private String transport_type;

    @OneToMany(mappedBy = "tour", fetch = FetchType.LAZY)
    private List<Booking> bookings;

    @OneToMany(mappedBy = "tour", fetch = FetchType.LAZY)
    private List<Review> reviews;

    @OneToMany(mappedBy = "tour", fetch = FetchType.LAZY)
    private List<Tour_Server> tourServers;

	public Integer getTour_id() {
		return tour_id;
	}

	public void setTour_id(Integer tour_id) {
		this.tour_id = tour_id;
	}

	public String getTour_name() {
		return tour_name;
	}

	public void setTour_name(String tour_name) {
		this.tour_name = tour_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getHotel_name() {
		return hotel_name;
	}

	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}

	public String getTransport_type() {
		return transport_type;
	}

	public void setTransport_type(String transport_type) {
		this.transport_type = transport_type;
	}

	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public List<Tour_Server> getTourServers() {
		return tourServers;
	}

	public void setTourServers(List<Tour_Server> tourServers) {
		this.tourServers = tourServers;
	}

	public Tour(Integer tour_id, String tour_name, String description, Double price, String start_date, String end_date,
			String destination, String hotel_name, String transport_type, List<Booking> bookings, List<Review> reviews,
			List<Tour_Server> tourServers) {
		super();
		this.tour_id = tour_id;
		this.tour_name = tour_name;
		this.description = description;
		this.price = price;
		this.start_date = start_date;
		this.end_date = end_date;
		this.destination = destination;
		this.hotel_name = hotel_name;
		this.transport_type = transport_type;
		this.bookings = bookings;
		this.reviews = reviews;
		this.tourServers = tourServers;
	}

	public Tour() {
		super();
	}
    
    
}
