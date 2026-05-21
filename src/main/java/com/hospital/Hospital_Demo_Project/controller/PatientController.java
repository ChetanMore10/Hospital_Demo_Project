package com.hospital.Hospital_Demo_Project.controller;

import com.hospital.Hospital_Demo_Project.entity.Patient;
import com.hospital.Hospital_Demo_Project.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping("/patient")
    public ResponseEntity<Patient> savePatient(@RequestBody Patient patient){
        Patient patient1 = patientService.addPatient(patient);
        return new ResponseEntity<>(patient1, HttpStatus.CREATED);
    }
}
