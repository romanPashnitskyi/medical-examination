package com.medical.service.services.servicesImpl;

import com.medical.service.model.Patient;
import com.medical.service.model.Worker;
import com.medical.service.repositories.PatientRepositories;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.sql.Date;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class PatientServiceImplTest {

    private final String NAME_PATIENTS = "Patient1";

    @Mock
    PatientRepositories patientRepositories;

    @InjectMocks
    PatientServiceImpl patientService;


    Patient patient;

    Worker worker;

    Set<Patient> patients = new HashSet<>();

    @Before
    public void setUp() throws Exception {

        worker = Worker.builder().name("Worker").email("worker@email.com").accessDatabaseType("1").
                accountStatus("1").login("login").password("password").build();

        patient = Patient.builder().name("Patient").dateOfBirth(java.sql.Date.valueOf("2010-01-31")).sex(1).worker(worker).build();


        patients.add(Patient.builder().name("Patient1Set").dateOfBirth(java.sql.Date.valueOf("2010-01-29")).sex(1).worker(worker).build());
        patients.add(Patient.builder().name("Patient2Set").dateOfBirth(java.sql.Date.valueOf("2010-01-30")).sex(2).worker(worker).build());
        patients.add(Patient.builder().name("Patient3Set").dateOfBirth(java.sql.Date.valueOf("2010-01-31")).sex(1).worker(worker).build());
    }


    @Test
    public void findAll() {
        when(patientRepositories.findAll()).thenReturn(patients);

        Set<Patient> patients = patientService.findAll();

        assertNotNull(patients);

        assertEquals(3, patients.size());
    }

    @Test
    public void findById() {

        when(patientRepositories.findById(anyInt())).thenReturn(Optional.of(patient));

        assertEquals("Patient", patient.getName());

        assertNotNull(patientService.findById(patient.getId()));

    }

    @Test
    public void save() {
        Patient newPatient = Patient.builder().name("NewPatient").dateOfBirth(java.sql.Date.valueOf("2010-01-01")).
                sex(1).worker(worker).build();

        when(patientRepositories.save(any(Patient.class))).thenReturn(newPatient);

        Patient savedPatient = patientService.save(newPatient);

        assertNotNull(savedPatient);

        verify(patientRepositories).save(any(Patient.class));
    }

    @Test
    public void delete() {
        patientService.delete(patient);

        verify(patientRepositories, times(1)).delete(any(Patient.class));
    }

    @Test
    public void deleteById() {
        patientService.deleteById(patient.getId());

        verify(patientRepositories, times(1)).deleteById(anyInt());
    }

    @Test
    public void findAllByNameContaining() {

        when(patientRepositories.findAllByNameContaining(anyString())).thenReturn(patients);

        Set<Patient> patientSet = patientService.findAllByNameContaining(NAME_PATIENTS);

        assertNotNull(patientSet);

        //*************************************************
        //assertEquals(1, patientSet.size());

        verify(patientRepositories).findAllByNameContaining(anyString());
    }

    @Test(expected = RuntimeException.class)
    public void findByIdNotFound(){
       Patient patientNotFound = patientService.findById(111);

       assertNull(patientNotFound);

       verify(patientRepositories, times(1)).findById(anyInt());
    }
}