package com.aa.springdemo.repository;

import com.aa.springdemo.entity.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CustomerCustomRepositoryImpl implements CustomerCustomRepository{

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Customer> getAllCustomer() {
        List<Customer> customerList = em.createQuery("Select e from Customer e").getResultList();
       return customerList;
    }
}
