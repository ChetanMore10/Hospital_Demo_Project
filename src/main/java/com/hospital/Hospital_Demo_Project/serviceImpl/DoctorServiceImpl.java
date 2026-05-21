package com.hospital.Hospital_Demo_Project.serviceImpl;

import com.hospital.Hospital_Demo_Project.entity.Doctor;
import com.hospital.Hospital_Demo_Project.repository.DoctorRepo;
import com.hospital.Hospital_Demo_Project.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepo doctorRepo;

    @Override
    public Doctor addDoctor(Doctor doctor) {
        return doctorRepo.save(doctor);
    }
}
