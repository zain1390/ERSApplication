package com.amvotech.rest;

import com.amvotech.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.amvotech.model.Patient;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value = "/api")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @PostMapping(value = "/patients")
    public ResponseEntity<Patient> registerPatient(@RequestBody Patient patient) {
        return ResponseEntity.ok(patientService.safePatient(patient));

    }

    @GetMapping(value = "/getpatients")
    public ResponseEntity<List<Patient>> getAllPatient() {
        return ResponseEntity.ok(patientService.getAllPatient());
    }
    @GetMapping(value = "/getpatientbyid/{pid}")
    public ResponseEntity<Optional<Patient>> getPatientById(@PathVariable String pid){
        Long tempId = Long.valueOf(pid);
        return ResponseEntity.ok(patientService.getPatientById(tempId));
    }
}
