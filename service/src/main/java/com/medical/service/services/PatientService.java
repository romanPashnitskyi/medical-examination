package com.medical.service.services;

import com.medical.service.model.Patient;

import java.util.Set;

public interface PatientService extends GrudService<Patient, Integer> {

    Set<Patient> findAllByNameContaining(String name);
}
