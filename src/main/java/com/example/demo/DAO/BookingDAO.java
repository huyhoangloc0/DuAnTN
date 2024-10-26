package com.example.demo.DAO;

import com.example.demo.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingDAO extends JpaRepository<Booking, Integer> {
    // Có thể thêm các phương thức tùy chỉnh nếu cần
}
