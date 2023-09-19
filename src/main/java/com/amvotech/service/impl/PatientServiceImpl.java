package com.amvotech.service.impl;

import com.amvotech.service.PatientService;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService {
    @Override
    public int getNumberOfPatients() {
        return 1000;
    }
}
