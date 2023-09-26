package com.amvotech.rest;

import com.amvotech.model.MedicalRecord;
import com.amvotech.service.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @PutMapping(value = "/updatePatient/{medicalId}")
    public ResponseEntity<MedicalRecord> updateMedicalRecord(
            @PathVariable("medicalId") String medicalId,
            @RequestBody MedicalRecord medicalRecord
    ){
        System.out.println(medicalId);
        return ResponseEntity.ok(medicalRecordService.updateMedicalRecord(medicalRecord));
    }
}
