package com.test.ordermanagementsystem.repository;

import com.test.ordermanagementsystem.entity.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerTypeRepo extends JpaRepository<CustomerType, Long> {

    CustomerType findByIdAndAndDeletedFalse(Long id);
    CustomerType findByTypeAndDeletedFalse(String type);

}
