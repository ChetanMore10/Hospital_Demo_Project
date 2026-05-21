package com.hospital.Hospital_Demo_Project.service;

import com.hospital.Hospital_Demo_Project.entity.Patient;
import org.springframework.stereotype.Service;

@Service
public interface PatientService {

    Patient addPatient(Patient patient);
}
