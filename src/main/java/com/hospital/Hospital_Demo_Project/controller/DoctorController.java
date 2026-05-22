package com.hospital.Hospital_Demo_Project.controller;

import com.hospital.Hospital_Demo_Project.entity.Doctor;
import com.hospital.Hospital_Demo_Project.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @PostMapping("/doctor")
    public ResponseEntity<Doctor> SaveDoctor(@RequestBody Doctor doctor){
        Doctor doctor1 = doctorService.addDoctor(doctor);
        return new ResponseEntity<>(doctor1, HttpStatus.CREATED);
    }

    @GetMapping("/doctor")
    public ResponseEntity<List<Doctor>> getAll(){
        List<Doctor> doctorList = doctorService.getAllDoctor();
        return new ResponseEntity<>(doctorList, HttpStatus.FOUND);
    }

    @PutMapping("/doctor/{doctorId}")
    public ResponseEntity<Doctor> updateDoctor(@RequestBody Doctor doctor, @PathVariable Long doctorId){
        Doctor doctor1 = doctorService.updateDoctor(doctor, doctorId);
        return new ResponseEntity<>(doctor1, HttpStatus.OK);
    }

    @DeleteMapping("/doctor/{doctorId}")
    public ResponseEntity<String> deleteDoctor(@PathVariable Long doctorId){
        doctorService.deleteDoctor(doctorId);
        return new ResponseEntity<>("Doctor Deleted Successfully..!", HttpStatus.OK);
    }


}
