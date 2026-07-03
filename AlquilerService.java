package hct.caycho.carlos.service;

import hct.caycho.carlos.model.Alquiler;
import hct.caycho.carlos.repository.AlquilerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class AlquilerService {

    private final AlquilerRepository alquilerRepository;

    public Flux<Alquiler> findAll() {
        return alquilerRepository.findAll();
    }

    public Mono<Alquiler> findById(Long id) {
        return alquilerRepository.findById(id);
    }

    public Mono<Alquiler> save(Alquiler alquiler) {
        return alquilerRepository.save(alquiler);
    }

    public Mono<Alquiler> update(Alquiler alquiler, Long id) {
        alquiler.setId(id);
        return alquilerRepository.save(alquiler);
    }

    public Mono<Void> deleteById(Long id) {
        return alquilerRepository.deleteById(id);
    }
}
