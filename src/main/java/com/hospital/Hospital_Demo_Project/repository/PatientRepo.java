package com.hospital.Hospital_Demo_Project.repository;

import com.hospital.Hospital_Demo_Project.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Long> {

}
