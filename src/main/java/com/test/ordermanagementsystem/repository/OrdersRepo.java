package com.test.ordermanagementsystem.repository;

import com.test.ordermanagementsystem.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepo extends JpaRepository<Orders, Long> {
    List<Orders> findByCustomerIdAndDeletedFalse(Long customerId);
}
