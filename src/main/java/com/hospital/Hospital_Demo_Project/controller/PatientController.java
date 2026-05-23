package com.hospital.Hospital_Demo_Project.controller;

import com.hospital.Hospital_Demo_Project.entity.Patient;
import com.hospital.Hospital_Demo_Project.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping
    public ResponseEntity<Patient> savePatient(@RequestBody Patient patient){
        Patient patient1 = patientService.addPatient(patient);
        return new ResponseEntity<>(patient1, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Patient>> getPatient(){
        List<Patient> patientList = patientService.getAllPatient();
        return new ResponseEntity<>(patientList, HttpStatus.FOUND);
    }

    @PutMapping("/{patientId}")
    public ResponseEntity<Patient> updatePatient(@RequestBody Patient patient,
                                                 @PathVariable Long patientId){
        Patient patient1 = patientService.updatePatient(patient, patientId);
        return new ResponseEntity<>(patient1, HttpStatus.OK);
    }

    @DeleteMapping("/{patientId}")
    public ResponseEntity<String> delete(@PathVariable Long patientId){
        patientService.deletePatient(patientId);
        return new ResponseEntity<>("Patient Deleted Successfully..!", HttpStatus.OK);
    }
}
