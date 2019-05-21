package com.medical.service.controllers;

import com.medical.service.model.Worker;
import com.medical.service.services.WorkerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping({"/workers"})
public class WorkerController {

    private WorkerService workerService;

    public WorkerController(WorkerService workerService) {
        this.workerService = workerService;
    }

    @GetMapping(path = {"/{id}"})
    public Worker findOne(@PathVariable("id") int id) {
        return workerService.findById(id);
    }

    @GetMapping(path = {"/"})
    public Set<Worker> findAll() {
        return workerService.findAll();
    }

    @GetMapping(path = {"/{id}/patients/{patientID}"})
    public Worker findAll(@PathVariable("id") int id,@PathVariable("patientID") int patientID) {
        return workerService.findWorkerPatient(id,patientID);
    }

}
