package com.amvotech.service;

import com.amvotech.model.Patient;

import java.util.List;

public interface PatientService {
    public int getNumberOfPatients();

    public Patient safePatient(Patient patient);
    public List<Patient> getAllPatient();

}
