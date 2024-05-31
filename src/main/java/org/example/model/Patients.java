package org.example.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Patients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;

    @ManyToMany(targetEntity = Doctor.class)
    private List<Doctor> doctors;
}
