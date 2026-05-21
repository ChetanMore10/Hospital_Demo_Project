package com.hospital.Hospital_Demo_Project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String patientName;

    private Integer age;

    private String gender;

    private String disease;

    private String contactNumber;

    private String address;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;
}
