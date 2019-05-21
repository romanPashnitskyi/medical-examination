package com.medical.service.repositories;

import com.medical.service.model.Examination;
import org.springframework.data.repository.CrudRepository;

public interface ExaminationRepositories extends CrudRepository<Examination, Integer>{

}