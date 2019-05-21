package com.medical.service.repositories;

import com.medical.service.model.Treatment;
import org.springframework.data.repository.CrudRepository;

public interface TreatmentRepositories extends CrudRepository<Treatment, Integer> {

}
