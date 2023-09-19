package com.amvotech.rest;

import com.amvotech.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amvotech.model.Patient;


@RestController
@RequestMapping(value = "/api")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @PostMapping(value = "/patients")
    public ResponseEntity<Integer> registerPatient(@RequestBody Patient patient) {
        return ResponseEntity.ok(patientService.getNumberOfPatients());

    }


}
