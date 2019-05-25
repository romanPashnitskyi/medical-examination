package com.medical.service.repositories;

import com.medical.service.model.Worker;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface WorkerRepositories extends CrudRepository<Worker, Integer> {

    Set<Worker> findAllByNameContaining(String name);
}
