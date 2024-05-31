package org.example.model;

import jakarta.persistence.*;

@Entity
@Table
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
}
