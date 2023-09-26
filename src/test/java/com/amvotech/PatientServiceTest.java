package com.amvotech;

import com.amvotech.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PatientServiceTest {
    @Autowired
    private PatientService patientService;

    @Test
    void testGet() {
        assertEquals(2000, patientService.getNumberOfPatients());
    //    System.out.println(patientService.getNumberOfPatients());
    }
}
