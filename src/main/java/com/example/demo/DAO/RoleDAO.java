package com.example.demo.DAO;

import com.example.demo.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDAO extends JpaRepository<Role, String> {
    // Có thể thêm các phương thức tùy chỉnh nếu cần
}
