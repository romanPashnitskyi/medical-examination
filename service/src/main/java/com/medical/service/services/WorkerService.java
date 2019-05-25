package com.medical.service.services;

import com.medical.service.model.Worker;

import java.util.Set;

public interface WorkerService extends GrudService<Worker, Integer> {

    Set<Worker> findAllByNameContaining(String name);
}
