package com.aa.springdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="address")

public class Address {
    @Id
    @GeneratedValue
    private Integer id;
    private String details;

    public Address(String detail) {
        this.details = detail;
    }
}
