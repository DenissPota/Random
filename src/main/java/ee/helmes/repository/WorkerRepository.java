package ee.helmes.repository;

import ee.helmes.entities.WorkerJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepository extends JpaRepository<WorkerJPA, Long> {
}
