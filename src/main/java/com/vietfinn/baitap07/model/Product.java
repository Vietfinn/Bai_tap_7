package com.vietfinn.baitap07.model;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private int quantity;
    private String description;
    private double price;

    @ManyToOne
    private User user;

    @ManyToOne
    private Category category;

    // getters and setters
}