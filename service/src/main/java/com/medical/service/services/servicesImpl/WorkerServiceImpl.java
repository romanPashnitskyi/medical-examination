package com.medical.service.services.servicesImpl;

import com.medical.service.model.Worker;
import com.medical.service.repositories.WorkerRepositories;
import com.medical.service.services.WorkerService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class WorkerServiceImpl implements WorkerService {

    private WorkerRepositories workerRepositories;

    public WorkerServiceImpl(WorkerRepositories workerRepositories) {
        this.workerRepositories = workerRepositories;
    }

    @Override
    public Set<Worker> findAll() {
        Set<Worker> workers = new HashSet<>();
        workerRepositories.findAll().forEach(workers::add);
        return workers;
    }

    @Override
    public Worker findById(Integer id) {
        Optional<Worker> workersOptional = workerRepositories.findById(id);

        if (!workersOptional.isPresent()) {
            throw new RuntimeException("Worker Not Found!");
        }

        return workersOptional.get();
    }

    @Override
    public Worker save(Worker object) {
        return workerRepositories.save(object);
    }

    @Override
    public void delete(Worker object) {
        workerRepositories.delete(object);
    }

    @Override
    public void deleteById(Integer id) {
        workerRepositories.deleteById(id);
    }

    @Override
    public Worker findWorkerPatient(int id, int patientID) {
        return workerRepositories.findByIdAndPatients_id(id,patientID);
    }
}
