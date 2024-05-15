package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="information", uniqueConstraints = { @UniqueConstraint(name = "unique_title", columnNames = "title")})
public class Information {
    @Id
    private Integer Id;

    @Column(name = "title", length = 1000)
    private String title;
}
