package com.example.demo.DAO;

import com.example.demo.model.BookingDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingDetailDAO extends JpaRepository<BookingDetail, Integer> {
    // Có thể thêm các phương thức tùy chỉnh nếu cần
}
