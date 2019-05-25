package com.medical.service.controllers;

import com.medical.service.model.Worker;
import com.medical.service.services.WorkerService;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
@RequestMapping({"/workers"})
public class WorkerController {

    private WorkerService workerService;

    public WorkerController(WorkerService workerService) {
        this.workerService = workerService;
    }

    @GetMapping
    public Set<Worker> findAll() {
        return workerService.findAll();
    }

    @GetMapping(path = {"/{id}"})
    public Worker findOne(@PathVariable("id") int id) {
        return workerService.findById(id);
    }

    @GetMapping(path = {"/find/{name}"})
    public Set<Worker> findAllByNameContaining(@PathVariable("name") String name) {
        if (name.length() < 3) {
            throw new RuntimeException("The length of the worker's name is too small!");
        }
        return workerService.findAllByNameContaining(name);
    }

    @PostMapping(path = {"/new"})
    public Worker create(@RequestBody Worker worker) {
        return workerService.save(worker);
    }

    @PutMapping(path = {"/update/{id}"})
    public Worker update(@RequestBody Worker worker, @PathVariable int id) {
        worker.setId(id);
        return workerService.save(worker);
    }

    @DeleteMapping(path = {"/delete/{id}"})
    public void delete(@PathVariable("id") int id) {
        workerService.deleteById(id);
    }


//    @GetMapping(path ={"/howWorkPost"})
//    public void howWorkPost() {
//        create(new Worker("NAzar","asdfadf","1","1","dsfsdf","dsfsdf"));
//    }
//
//    @GetMapping(path ={"/howWorkDelete"})
//    public void howWorkDelete() {
//        delete(16);
//    }
//
//    @GetMapping(path ={"/howWorkUpdate"})
//    public void howWorkUpdate() {
//        Worker worker = workerService.findById(17);
//        worker.setTelephone("380680073283++");
//        update(worker,worker.getId());
//    }

}
