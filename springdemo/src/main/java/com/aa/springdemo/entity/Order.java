package com.aa.springdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue
    private int id;
    @OneToOne
    private Customer customer;
   // private Item[] items;
    private double amount;
    private double payment;
}
