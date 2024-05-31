package org.example.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToOne
    private Hospital hospital;

    @OneToOne
    private Schedule schedule;

    @ManyToMany(mappedBy = "doctors")
    private List<Patients> patients;
}
