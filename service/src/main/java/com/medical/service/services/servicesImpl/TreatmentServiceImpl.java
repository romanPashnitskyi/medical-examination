package com.medical.service.services.servicesImpl;

import com.medical.service.repositories.TreatmentRepositories;
import com.medical.service.model.Treatment;
import com.medical.service.services.TreatmentService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class TreatmentServiceImpl implements TreatmentService {

    private TreatmentRepositories treatmentRepositories;

    public TreatmentServiceImpl(TreatmentRepositories treatmentRepositories) {
        this.treatmentRepositories = treatmentRepositories;
    }

    @Override
    public Set<Treatment> findAll() {
        Set<Treatment> treatments = new HashSet<>();
        treatmentRepositories.findAll().forEach(treatments::add);
        return treatments;
    }

    @Override
    public Treatment findById(Integer id) {
        Optional<Treatment> treatmentOptional = treatmentRepositories.findById(id);

        if (!treatmentOptional.isPresent()) {
            throw new RuntimeException("Treatment Not Found!");
        }

        return treatmentOptional.get();
    }

    @Override
    public Treatment save(Treatment object) {
        return treatmentRepositories.save(object);
    }

    @Override
    public void delete(Treatment object) {
        treatmentRepositories.delete(object);
    }

    @Override
    public void deleteById(Integer id) {
        treatmentRepositories.deleteById(id);
    }

}
