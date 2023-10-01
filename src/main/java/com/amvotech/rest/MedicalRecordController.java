package com.amvotech.rest;

import com.amvotech.model.MedicalRecord;
import com.amvotech.service.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/medical")
public class MedicalRecordController {
    @Autowired
    private MedicalRecordService medicalRecordService;

    @PostMapping(value = "/patients")
    public ResponseEntity<MedicalRecord> createMedicalRecord(
            @RequestBody MedicalRecord medicalRecord
    ) {
        System.out.println("This is medical data" + medicalRecord);
        return ResponseEntity.ok(medicalRecordService.createMedicalRecord(medicalRecord));
    }

    @PutMapping(value = "/updatePatient/{medicalId}")
    public ResponseEntity<MedicalRecord> updateMedicalRecord(
            @PathVariable("medicalId") String medicalId,
            @RequestBody MedicalRecord actualMedicalRecord
    ) {
        Long tempId = Long.valueOf(medicalId);
        Optional<MedicalRecord> medicalTemp = medicalRecordService.getMedicalRecordById(tempId);
        MedicalRecord dataBaseData = medicalTemp.get();
        if (actualMedicalRecord.getRecordDate() != null) {
            dataBaseData.setRecordDate(actualMedicalRecord.getRecordDate());
        }
        if (actualMedicalRecord.getDiagnosis() != null) {
            dataBaseData.setDiagnosis(actualMedicalRecord.getDiagnosis());
        }
        if (actualMedicalRecord.getTestResults() != null) {
            dataBaseData.setTestResults(actualMedicalRecord.getTestResults());
        }
        if (actualMedicalRecord.getTreatments() != null) {
            dataBaseData.setTreatments((actualMedicalRecord.getTreatments()));
        }
        return ResponseEntity.ok(medicalRecordService.createMedicalRecord(dataBaseData));
    }
    @GetMapping(value = "/medicalRecords/{id}")
    public ResponseEntity<MedicalRecord> getMedicalRecordById(@PathVariable String id) {
        Optional<MedicalRecord> medicalRecord = medicalRecordService.getMedicalRecordById(Long.valueOf(id));
        if (medicalRecord.isPresent()) {
            return ResponseEntity.ok(medicalRecord.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}