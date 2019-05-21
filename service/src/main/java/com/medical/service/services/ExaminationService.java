package com.medical.service.services;

import com.medical.service.model.Examination;

public interface ExaminationService extends GrudService<Examination, Integer> {

    public Examination findById(Integer id);
}
