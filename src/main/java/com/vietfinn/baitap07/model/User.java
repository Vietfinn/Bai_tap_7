package com.vietfinn.baitap07.model;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullname;
    private String email;
    private String password;
    private String phone;

    @ManyToMany(mappedBy = "users")
    private Set<Category> categories = new HashSet<>();

    // getters and setters
}