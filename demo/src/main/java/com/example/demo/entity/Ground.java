package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Ground")
@Setter
@Getter
public class Ground{
    @Id
    @Column(name = "ground_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @Column(name = "ground", length = 256)
    private String ground;
}

