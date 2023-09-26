package com.amvotech.service;

import com.amvotech.model.MedicalRecord;

public interface MedicalRecordService {
    public MedicalRecord  createMedicalRecord(MedicalRecord medicalRecord);

    public MedicalRecord  updateMedicalRecord(MedicalRecord medicalRecord);
}
