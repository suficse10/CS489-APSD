package edu.miu.lab6.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientId;
    private String patientNo;
    private String firstName;
    private String lastName;
    @OneToOne
    @JoinColumn
    private Address address;
    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointments;
}
