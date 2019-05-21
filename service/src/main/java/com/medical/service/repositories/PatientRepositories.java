package com.medical.service.repositories;

import com.medical.service.model.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepositories extends CrudRepository<Patient, Integer> {

    Patient findByIdAndWorker_Id(Integer id, Integer workerID);

}
