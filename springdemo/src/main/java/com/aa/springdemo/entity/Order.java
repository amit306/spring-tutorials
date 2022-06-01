package com.aa.springdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@Table(name="orders")

public class Order {
    @Id
    @GeneratedValue
    private int id;
    @OneToOne
    private Customer customer;
    @OneToMany(targetEntity=Order.class,fetch= FetchType.LAZY)
    private List<Item> item ;
    private double amount;
    private double payment;
}
