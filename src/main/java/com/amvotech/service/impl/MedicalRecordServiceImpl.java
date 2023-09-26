package com.amvotech.service.impl;

import com.amvotech.dao.MedicalRecordRepository;
import com.amvotech.model.MedicalRecord;
import com.amvotech.service.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicalRecordServiceImpl implements MedicalRecordService {

    @Autowired
    private MedicalRecordRepository medicalRecordRepository;

    @Override
    public MedicalRecord createMedicalRecord(MedicalRecord medicalRecord) {
        MedicalRecord item = medicalRecordRepository.save(medicalRecord);
        return item;
    }

    @Override
    public MedicalRecord updateMedicalRecord(MedicalRecord medicalRecord) {
        try{
            MedicalRecord item = medicalRecordRepository.save(medicalRecord);
            return item;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
