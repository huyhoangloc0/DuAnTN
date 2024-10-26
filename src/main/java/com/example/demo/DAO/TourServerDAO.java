package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.TourServerId;
import com.example.demo.model.Tour_Server;

@Repository
public interface TourServerDAO extends JpaRepository<Tour_Server, TourServerId> {
    // Bạn có thể thêm các phương thức tùy chỉnh ở đây nếu cần
}
