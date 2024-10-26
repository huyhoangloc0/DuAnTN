package com.example.demo.DAO;

import com.example.demo.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentDAO extends JpaRepository<Payment, Integer> {
    // Có thể thêm các phương thức tùy chỉnh nếu cần
}
