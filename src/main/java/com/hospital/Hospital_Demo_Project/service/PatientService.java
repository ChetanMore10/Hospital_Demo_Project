package com.hospital.Hospital_Demo_Project.service;

import com.hospital.Hospital_Demo_Project.entity.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PatientService {

    Patient addPatient(Patient patient);
    List<Patient> getAllPatient();
    Patient updatePatient(Patient patient, Long patientId);
    String deletePatient(Long patientId);
}
