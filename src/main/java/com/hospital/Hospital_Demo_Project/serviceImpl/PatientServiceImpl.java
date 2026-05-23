package com.hospital.Hospital_Demo_Project.serviceImpl;

import com.hospital.Hospital_Demo_Project.entity.Patient;
import com.hospital.Hospital_Demo_Project.repository.PatientRepo;
import com.hospital.Hospital_Demo_Project.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepo patientRepo;

    @Override
    public Patient addPatient(Patient patient) {
        return patientRepo.save(patient);
    }

    @Override
    public List<Patient> getAllPatient() {
        return patientRepo.findAll();
    }

    @Override
    public Patient updatePatient(Patient patient, Long patientId) {
        Patient exestingPatient = patientRepo.findById(patientId)
                .orElseThrow(()->new RuntimeException("Patient Not Found With Id :" + patientId));
        exestingPatient.setPatientName(patient.getPatientName());
        exestingPatient.setAge(patient.getAge());
        exestingPatient.setDoctor(patient.getDoctor());
        exestingPatient.setDisease(patient.getDisease());
        exestingPatient.setGender(patient.getGender());
        exestingPatient.setContactNumber(patient.getContactNumber());
        exestingPatient.setAddress(patient.getAddress());

        return patientRepo.save(exestingPatient);
    }

    @Override
    public String deletePatient(Long patientId) {
        patientRepo.findById(patientId)
                .orElseThrow(()-> new RuntimeException("Patient Not Found with id :" + patientId));
        patientRepo.deleteById(patientId);
        return "";
    }
}
