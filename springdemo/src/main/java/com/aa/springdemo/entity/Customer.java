package com.aa.springdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.*;

@Entity
@AllArgsConstructor
@Data
public class Customer {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @OneToMany(targetEntity=Address.class,fetch= FetchType.EAGER)
    private List<Address> addresses;
}
