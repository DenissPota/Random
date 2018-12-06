package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.Worker;
import io.swagger.model.Workers;

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WorkersApiControllerIntegrationTest {

    @Autowired
    private WorkersApi api;

    @Test
    public void addWorkerTest() throws Exception {
        Worker body = new Worker();
        ResponseEntity<Worker> responseEntity = api.addWorker(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void listAllWorkersTest() throws Exception {
        Integer limit = 56;
        ResponseEntity<Workers> responseEntity = api.listAllWorkers(limit);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }

    @Test
    public void listWorkerByIdTest() throws Exception {
        Long workerId = 789L;
        ResponseEntity<Worker> responseEntity = api.listWorkerById(workerId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
