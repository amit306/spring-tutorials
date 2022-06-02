package com.aa.springdemo.service;

import com.aa.springdemo.entity.Customer;
import com.aa.springdemo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public void createCustomer(Customer cust){
        customerRepository.save(cust);
    }

    public List<Customer> getAllCustomer(){
        return customerRepository.findAll();
    }

    public Customer getCustomerByName(String name){
        return customerRepository.getCustomerByName(name);
    }
}
