package com.medical.service.repositories;

import com.medical.service.model.Worker;
import org.springframework.data.repository.CrudRepository;

public interface WorkerRepositories extends CrudRepository<Worker, Integer> {

    Worker findByIdAndPatients_id(int id, int patientID);
}
