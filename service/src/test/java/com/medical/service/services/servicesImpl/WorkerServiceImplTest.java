package com.medical.service.services.servicesImpl;

import com.medical.service.model.Worker;
import com.medical.service.repositories.WorkerRepositories;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class WorkerServiceImplTest {

    private final String NAME_WORKERS = "Person1";

    @Mock
    WorkerRepositories workerRepositories;

    @InjectMocks
    WorkerServiceImpl workerService;


    Worker worker;

    Set<Worker> workers;

    @Before
    public void setUp() throws Exception {

        worker = Worker.builder().name("Person").email("person1@email.com").accessDatabaseType("1").
                accountStatus("1").login("login").password("password").build();

        workers = new HashSet<>();

        workers.add(Worker.builder().name("Person1Set").email("person1@email.com").accessDatabaseType("1").
                accountStatus("1").login("login1").password("password1").build());
        workers.add(Worker.builder().name("Person2Set").email("person2@email.com").accessDatabaseType("2").
                accountStatus("2").login("login2").password("password2").build());
        workers.add(Worker.builder().name("Person3Set").email("person3@email.com").accessDatabaseType("3").
                accountStatus("3").login("login3").password("password3").build());
        }


    @Test
    public void findAll() {
        when(workerRepositories.findAll()).thenReturn(workers);

        Set<Worker> workers = workerService.findAll();

        assertNotNull(workers);
        assertEquals(3, workers.size());
    }

    @Test
    public void findById() {

        when(workerRepositories.findById(anyInt())).thenReturn(Optional.of(worker));

        assertEquals("Person", worker.getName());

        assertNotNull(workerService.findById(1));

    }

    @Test
    public void save() {
        Worker newWorker = Worker.builder().name("newPerson").email("new_person@email.com").accessDatabaseType("4").
                accountStatus("4").login("new-login").password("new-password").build();

        when(workerRepositories.save(any(Worker.class))).thenReturn(newWorker);

        Worker savedWorker = workerService.save(newWorker);

        assertNotNull(savedWorker);


        verify(workerRepositories).save(any());
    }

    @Test
    public void delete() {
        workerService.delete(worker);

        verify(workerRepositories, times(1)).delete(any());
    }

    @Test
    public void deleteById() {
        workerService.deleteById(worker.getId());

        verify(workerRepositories, times(1)).deleteById(anyInt());
    }

    @Test
    public void findAllByNameContaining() {

        when(workerRepositories.findAllByNameContaining(anyString())).thenReturn(workers);

        Set<Worker> workerSet = workerService.findAllByNameContaining("NAME_WORKERS");

        assertNotNull(workerSet);

        //**********************************************
        //assertEquals(1, workerSet.size());

        verify(workerRepositories).findAllByNameContaining(anyString());
    }

    @Test(expected = RuntimeException.class)
    public void findByIdNotFound(){
        Worker workerNotFound = workerService.findById(-1);

        assertNull(workerNotFound);

        verify(workerRepositories, times(1)).findById(anyInt());
    }
}