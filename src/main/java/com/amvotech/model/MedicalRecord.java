package com.amvotech.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MedicalRecord {
    @Id
    private Long medicalId;
    @ManyToOne
    @JoinColumn(name = "patientId")
    private Patient patient;
    private Date recordDate;
    private String diagnosis;
    private String treatments;
    private String testResults;

}
