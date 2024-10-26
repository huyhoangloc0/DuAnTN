package com.example.demo.DAO;

import com.example.demo.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServerDAO extends JpaRepository<Server, Integer> {
    // Có thể thêm các phương thức tùy chỉnh nếu cần
}
