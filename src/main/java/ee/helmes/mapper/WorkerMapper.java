package ee.helmes.mapper;

import ee.helmes.entities.WorkerJPA;
import io.swagger.model.Worker;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface WorkerMapper {

    WorkerMapper INSTANCE = Mappers.getMapper(WorkerMapper.class);


    @Mapping(source = "workerId", target = "id")
    WorkerJPA workerToWorkerJPA(Worker worker);


    @InheritInverseConfiguration
    Worker workerJPAToWorker(WorkerJPA workerJPA);


}
