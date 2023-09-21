package com.amvotech.service.impl;

import com.amvotech.dao.PatientRepository;
import com.amvotech.model.Patient;
import com.amvotech.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public int getNumberOfPatients() {
        return 1000;
    }

    @Override
    public Patient safePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public List<Patient> getAllPatient() {
        return patientRepository.findAll();
    }

}
