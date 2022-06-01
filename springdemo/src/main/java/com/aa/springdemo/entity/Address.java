package com.aa.springdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@Data
@Table(name="address")

public class Address {
    @Id
    @GeneratedValue
    private Integer id;
    private String details;
}
