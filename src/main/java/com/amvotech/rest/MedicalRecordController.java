package com.amvotech.rest;

import com.amvotech.model.MedicalRecord;
import com.amvotech.service.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/medical")
@RestController
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
}
