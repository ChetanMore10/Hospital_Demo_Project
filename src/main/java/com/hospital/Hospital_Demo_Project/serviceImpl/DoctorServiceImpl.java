package com.hospital.Hospital_Demo_Project.serviceImpl;

import com.hospital.Hospital_Demo_Project.entity.Doctor;
import com.hospital.Hospital_Demo_Project.repository.DoctorRepo;
import com.hospital.Hospital_Demo_Project.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepo doctorRepo;

    @Override
    public Doctor addDoctor(Doctor doctor) {
        return doctorRepo.save(doctor);
    }

    @Override
    public List<Doctor> getAllDoctor() {
        return doctorRepo.findAll();
    }

    @Override
    public Doctor updateDoctor(Doctor doctor, Long doctorId) {
        Doctor currentDoctor = doctorRepo.findById(doctorId)
                .orElseThrow(()->new RuntimeException("Doctor Not Found with :" + doctorId));
        currentDoctor.setDoctorName(doctor.getDoctorName());
        currentDoctor.setEmail(doctor.getEmail());
        currentDoctor.setPatients(doctor.getPatients());
        currentDoctor.setExperience(doctor.getExperience());
        currentDoctor.setSpecialization(doctor.getSpecialization());
        currentDoctor.setContactNumber(doctor.getContactNumber());
        return doctorRepo.save(currentDoctor);
    }

    @Override
    public String deleteDoctor(Long doctorId) {
       doctorRepo.findById(doctorId)
                .orElseThrow(()-> new RuntimeException("Doctor Not Available with :" + doctorId));
        doctorRepo.deleteById(doctorId);
        return "Doctor Deleted Successfully...!";
    }
}
