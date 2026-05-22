package com.hospital.Hospital_Demo_Project.service;

import com.hospital.Hospital_Demo_Project.entity.Doctor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DoctorService {

    Doctor addDoctor(Doctor doctor);
    List<Doctor> getAllDoctor();
    Doctor updateDoctor(Doctor doctor, Long doctorId);
    String deleteDoctor(Long doctorId);

}
