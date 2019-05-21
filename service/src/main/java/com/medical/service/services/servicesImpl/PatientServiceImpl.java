package com.medical.service.services.servicesImpl;

import com.medical.service.repositories.PatientRepositories;
import com.medical.service.model.Patient;
import com.medical.service.services.PatientService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class PatientServiceImpl implements PatientService {

    private PatientRepositories patientRepositories;

    public PatientServiceImpl(PatientRepositories patientRepositories) {
        this.patientRepositories = patientRepositories;
    }

    @Override
    public Set<Patient> findAll() {
        Set<Patient> patients = new HashSet<>();
        patientRepositories.findAll().forEach(patients::add);
        return patients;
    }

    @Override
    public Patient findById(Integer id) {
        Optional<Patient> patientOptional = patientRepositories.findById(id);

        if (!patientOptional.isPresent()) {
            throw new RuntimeException("Patient Not Found!");
        }

        return patientOptional.get();
    }

    @Override
    public Patient save(Patient object) {
        return patientRepositories.save(object);
    }

    @Override
    public void delete(Patient object) {
        patientRepositories.delete(object);
    }

    @Override
    public void deleteById(Integer id) {
        patientRepositories.deleteById(id);
    }
}
