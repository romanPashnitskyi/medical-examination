package com.medical.service.controllers;

import com.medical.service.model.Treatment;
import com.medical.service.services.TreatmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/treatments"})
public class TreatmentController {

    private TreatmentService treatmentService;

    public TreatmentController(TreatmentService treatmentService) {
        this.treatmentService = treatmentService;
    }

    @GetMapping(path = {"/{id}"})
    public Treatment findOne(@PathVariable("id") int id) {
        return treatmentService.findById(id);
    }
}
