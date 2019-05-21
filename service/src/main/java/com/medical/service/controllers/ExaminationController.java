package com.medical.service.controllers;

import com.medical.service.model.Examination;
import com.medical.service.services.ExaminationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/examinations"})
public class ExaminationController {

    private ExaminationService examinationService;

    public ExaminationController(ExaminationService examinationService) {
        this.examinationService = examinationService;
    }

    @GetMapping(path = {"/{id}"})
    public Examination findOne(@PathVariable("id") Integer id) {
        return examinationService.findById(id);
    }
}
