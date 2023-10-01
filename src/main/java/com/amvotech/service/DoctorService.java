package com.amvotech.service;

import com.amvotech.model.Doctor;

import java.util.List;
import java.util.Optional;

public interface DoctorService {
    public List<Doctor> getAllDoctors();

    public Optional<Doctor> getDoctorById(Long doctorId);

    public Doctor createDoctor(Doctor doctor);

    public void deleteDoctorById(Long doctorId);
}
