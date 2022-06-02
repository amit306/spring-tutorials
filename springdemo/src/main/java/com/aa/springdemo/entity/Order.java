package com.aa.springdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import java.util.List;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="orders")

public class Order {
    @Id
    @GeneratedValue
    private int id;
    @OneToOne
    private Customer customer;
    //@OneToMany(fetch = FetchType.LAZY, mappedBy = "orders")
    @OneToMany(targetEntity=Item.class,fetch= FetchType.LAZY)
    private List<Item> items ;
    private double amount;
    private double payment;

    public Order(Customer cust, List<Item> items, double amount, double payment) {
        this.customer = cust;
        this.items = items;
        this.amount = amount;
        this.payment = payment;


    }
}
