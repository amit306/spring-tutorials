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
@Data
@NoArgsConstructor
@Table(name="item")

public class Item {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    public Item(String name) {
        this.name = name;
    }
}
