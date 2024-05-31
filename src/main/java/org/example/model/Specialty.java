package org.example.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Specialty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany
    private List<Doctor> doctor;
}
