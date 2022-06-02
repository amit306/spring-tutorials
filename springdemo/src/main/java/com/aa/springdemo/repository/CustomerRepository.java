package com.aa.springdemo.repository;

import com.aa.springdemo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    @Query(value="select * from customer where name =:firstName",nativeQuery=true)
    public Customer getCustomerByName(@Param("firstName")String firstName);
}
