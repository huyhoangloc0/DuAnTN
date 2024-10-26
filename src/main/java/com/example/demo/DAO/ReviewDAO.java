package com.example.demo.DAO;

import com.example.demo.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewDAO extends JpaRepository<Review, Integer> {
    // Có thể thêm các phương thức tùy chỉnh nếu cần
}
