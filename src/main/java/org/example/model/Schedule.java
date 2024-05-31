package org.example.model;

import jakarta.persistence.*;

@Entity
@Table
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String type;
    private String date_time;
}
