package hct.caycho.carlos.repository;

import hct.caycho.carlos.model.Alquiler;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface AlquilerRepository extends ReactiveCrudRepository<Alquiler, Long> {

}