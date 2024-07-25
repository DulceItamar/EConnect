package com.c19_136_swift.MedicalConnect.Service;

import com.c19_136_swift.MedicalConnect.domain.patient.Patient;
import com.c19_136_swift.MedicalConnect.domain.patient.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public Optional<Patient> findActivePatientByEmail(String email){

        return patientRepository.findByEmailAndActive(email);
    }

    public Optional<Patient> findByActivePatientByEmail(Long id) {
        return patientRepository.findByIdAndActive(id);
    }

    public Optional<Patient> findByActivePatientByName(String name){
       return patientRepository.findByNameAndActive(name);
    }

}
