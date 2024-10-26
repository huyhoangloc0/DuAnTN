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
@Table(name = "Booking")
public class Booking implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer booking_id;

    @ManyToOne
    @JoinColumn(name = "username", nullable = false)
    private Account account;

    @ManyToOne
    @JoinColumn(name = "tour_id", nullable = false)
    private Tour tour;

    private String booking_date;
    private Integer number_of_people;
    private Double total_price;
    private String status;

    @OneToMany(mappedBy = "booking", fetch = FetchType.LAZY)
    private List<Payment> payments;

    @OneToMany(mappedBy = "booking", fetch = FetchType.LAZY)
    private List<BookingDetail> bookingDetails;

	public Integer getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(Integer booking_id) {
		this.booking_id = booking_id;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Tour getTour() {
		return tour;
	}

	public void setTour(Tour tour) {
		this.tour = tour;
	}

	public String getBooking_date() {
		return booking_date;
	}

	public void setBooking_date(String booking_date) {
		this.booking_date = booking_date;
	}

	public Integer getNumber_of_people() {
		return number_of_people;
	}

	public void setNumber_of_people(Integer number_of_people) {
		this.number_of_people = number_of_people;
	}

	public Double getTotal_price() {
		return total_price;
	}

	public void setTotal_price(Double total_price) {
		this.total_price = total_price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	public List<BookingDetail> getBookingDetails() {
		return bookingDetails;
	}

	public void setBookingDetails(List<BookingDetail> bookingDetails) {
		this.bookingDetails = bookingDetails;
	}

	public Booking(Integer booking_id, Account account, Tour tour, String booking_date, Integer number_of_people,
			Double total_price, String status, List<Payment> payments, List<BookingDetail> bookingDetails) {
		super();
		this.booking_id = booking_id;
		this.account = account;
		this.tour = tour;
		this.booking_date = booking_date;
		this.number_of_people = number_of_people;
		this.total_price = total_price;
		this.status = status;
		this.payments = payments;
		this.bookingDetails = bookingDetails;
	}

	public Booking() {
		super();
	}
    
    
}
