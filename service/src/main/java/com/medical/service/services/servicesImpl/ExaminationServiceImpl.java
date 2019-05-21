package com.medical.service.services.servicesImpl;

import com.medical.service.repositories.ExaminationRepositories;
import com.medical.service.model.Examination;
import com.medical.service.services.ExaminationService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class ExaminationServiceImpl implements ExaminationService {
    private ExaminationRepositories examinationRepositories;

    public ExaminationServiceImpl(ExaminationRepositories examinationRepositories) {
        this.examinationRepositories = examinationRepositories;
    }

    @Override
    public Set<Examination> findAll() {
        Set<Examination> examinations = new HashSet<>();
        examinationRepositories.findAll().forEach(examinations::add);
        return examinations;
    }

    @Override
    public Examination findById(Integer id) {
        Optional<Examination> examinationOptional = examinationRepositories.findById(id);

        if (!examinationOptional.isPresent()) {
            throw new RuntimeException("Examination Not Found!");
        }

        return examinationOptional.get();
    }

    @Override
    public Examination save(Examination object) {
        return examinationRepositories.save(object);
    }

    @Override
    public void delete(Examination object) {
        examinationRepositories.delete(object);
    }

    @Override
    public void deleteById(Integer id) {
        examinationRepositories.deleteById(id);
    }
}
