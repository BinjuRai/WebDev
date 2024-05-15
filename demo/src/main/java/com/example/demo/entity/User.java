package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Users", uniqueConstraints = { @UniqueConstraint(name = "unique_username", columnNames = "username")})
public class User{
    @jakarta.persistence.Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @Column(name = "username", length = 256)
    private String username;

    @Column(name = "age", length = 256)
    private String age;

    @Column(name = "email", length = 256)
    private String email;

}