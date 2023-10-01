package com.amvotech.service;

import com.amvotech.model.MedicalRecord;

import java.util.Optional;

public interface MedicalRecordService {
    public MedicalRecord createMedicalRecord(MedicalRecord medicalRecord);


    public Optional<MedicalRecord> getMedicalRecordById(Long medicalId);

}
