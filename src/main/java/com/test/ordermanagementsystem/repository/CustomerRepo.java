package com.test.ordermanagementsystem.repository;

import com.test.ordermanagementsystem.entity.Customer;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {

  Customer findByIdAndAndDeletedFalse(Long id);
  Customer findByContactNumberAndDeletedFalse(String contactNumber);
  List<Customer> findAllByDeletedFalse();

}
