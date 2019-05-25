package com.medical.service.repositories;

import com.medical.service.model.Patient;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface PatientRepositories extends CrudRepository<Patient, Integer> {

    Patient findByIdAndWorker_Id(Integer id, Integer workerID);

    Set<Patient> findAllByNameContaining(String name);
}
