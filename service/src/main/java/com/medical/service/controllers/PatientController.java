package com.medical.service.controllers;

import com.medical.service.model.Patient;
import com.medical.service.services.PatientService;
import com.medical.service.services.WorkerService;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.Set;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
@RequestMapping({"/patients"})
public class PatientController {

    private PatientService patientService;
    private WorkerService workerService;

    public PatientController(PatientService patientService, WorkerService workerService) {
        this.patientService = patientService;
        this.workerService = workerService;
    }

    @GetMapping
    public Set<Patient> findAll() {
        return patientService.findAll();
    }

    @GetMapping(path = {"/{id}"})
    public Patient findOne(@PathVariable("id") int id) {
        return patientService.findById(id);
    }

    @GetMapping(path = {"/find/{name}"})
    public Set<Patient> findAllByNameContaining(@PathVariable("name") String name) {
        if (name.length() < 3) {
            throw new RuntimeException("The length of the patient's name is too small!");
        }
        return patientService.findAllByNameContaining(name);
    }

    @PostMapping(path = {"/new"})
    public Patient create(@RequestBody Patient patient) {
        return patientService.save(patient);
    }

    @PutMapping(path = {"/update/{id}"})
    public Patient update(@RequestBody Patient patient, @PathVariable int id) {
        patient.setId(id);
        return patientService.save(patient);
    }

    @DeleteMapping(path = {"/delete/{id}"})
    public void delete(@PathVariable("id") int id) {
        patientService.deleteById(id);
    }


//    @GetMapping(path = {"/howWorkPost"})
//    public void howWorkPost() {
//        create(new Patient("NAzar", java.sql.Date.valueOf("2010-01-31"), 1, workerService.findById(2)));
//    }
//
//    @GetMapping(path = {"/howWorkDelete"})
//    public void howWorkDelete() {
//        delete(1);
//    }
//
//    @GetMapping(path ={"/howWorkUpdate"})
//    public void howWorkUpdate() {
//        Patient patient = patientService.findById(3);
//        patient.setTelephone("380680073283*-*");
//        patient.setWorker(workerService.findById(3));
//        update(patient,patient.getId());
//    }
}
