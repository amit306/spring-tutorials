package com.aa.springdemo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@Data
public class Item {

     @Id
     @GeneratedValue
    private Integer id;
    private String name;

}