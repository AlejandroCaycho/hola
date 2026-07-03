package hct.caycho.carlos.controller;


import hct.caycho.carlos.model.Alquiler;
import hct.caycho.carlos.service.AlquilerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/api/alquiler")
@CrossOrigin("*")
public class AlquilerController {

    private final AlquilerService alquilerService;


    @GetMapping
    public Flux<Alquiler> getAll() {
        return alquilerService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Alquiler> getById(@PathVariable Long id) {
        return alquilerService.findById(id);
    }

    @PostMapping
    public Mono<Alquiler> save(@RequestBody Alquiler alquiler) {
        return alquilerService.save(alquiler);
    }

    @PutMapping("/{id}")
    public Mono<Alquiler> update(@RequestBody Alquiler alquiler ,  @PathVariable Long id) {
        alquiler.setId(id);
        return alquilerService.save(alquiler);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable Long id) {
        return alquilerService.deleteById(id);
    }
}
