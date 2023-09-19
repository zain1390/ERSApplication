package com.amvotech.rest;

import com.amvotech.model.MedicalRecord;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/medical")
@RestController
public class MedicalRecordController {
    @PostMapping(value = "/patients")
    public ResponseEntity<MedicalRecord> createMedicalRecord(
            @RequestBody MedicalRecord medicalRecord
            ) {
        System.out.println("This is medical data"+ medicalRecord);
        return ResponseEntity.ok(medicalRecord);

    }
}
