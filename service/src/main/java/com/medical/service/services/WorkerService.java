package com.medical.service.services;

import com.medical.service.model.Worker;

public interface WorkerService extends GrudService<Worker, Integer> {

    Worker findWorkerPatient(int id, int patientID);

}
