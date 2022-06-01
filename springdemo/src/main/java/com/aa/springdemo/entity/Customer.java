package com.aa.springdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.*;

@Entity
@AllArgsConstructor
@Data
@Table(name="customer")
public class Customer {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @OneToMany(targetEntity=Address.class,fetch= FetchType.LAZY)
    private List<Address> addresses;
}
