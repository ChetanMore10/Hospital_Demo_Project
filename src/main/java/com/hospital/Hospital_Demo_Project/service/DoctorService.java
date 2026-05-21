package com.hospital.Hospital_Demo_Project.service;

import com.hospital.Hospital_Demo_Project.entity.Doctor;
import org.springframework.stereotype.Service;

@Service
public interface DoctorService {

    Doctor addDoctor(Doctor doctor);

}
