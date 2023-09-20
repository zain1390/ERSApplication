package com.amvotech.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table
public class MedicalRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long medicalId;
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
    private Date recordDate;
    private String diagnosis;
    private String treatments;
    private String testResults;

}
