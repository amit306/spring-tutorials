package com.aa.springdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="customer")
public class Customer {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @OneToMany(targetEntity=Address.class,fetch= FetchType.EAGER,cascade = CascadeType.ALL)
    //@OneToMany(mappedBy="customer")
    private List<Address> addresses = new ArrayList<>();

    public Customer(String name, List<Address> address) {
        this.name = name;
        addresses.addAll(address);
    }
}
