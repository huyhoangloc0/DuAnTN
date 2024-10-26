package com.example.demo.DAO;

import com.example.demo.model.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityDAO extends JpaRepository<Authority, Integer> {
    // Có thể thêm các phương thức tùy chỉnh nếu cần
}
