package com.aa.springdemo.repository;

import com.aa.springdemo.entity.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
@Component
 public interface CustomerCustomRepository {
    List<Customer> getAllCustomer();
}
