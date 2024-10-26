package com.example.demo.DAO;

import com.example.demo.model.Tour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TourDAO extends JpaRepository<Tour, Integer> {
    // Có thể thêm các phương thức tùy chỉnh nếu cần
}
