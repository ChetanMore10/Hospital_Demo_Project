package com.hospital.Hospital_Demo_Project.serviceImpl;

import com.hospital.Hospital_Demo_Project.entity.Patient;
import com.hospital.Hospital_Demo_Project.repository.PatientRepo;
import com.hospital.Hospital_Demo_Project.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepo patientRepo;

    @Override
    public Patient addPatient(Patient patient) {
        return patientRepo.save(patient);
    }
}
