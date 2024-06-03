package br.com.fiap.ferramenta.resource;

import br.com.fiap.ferramenta.dto.request.EspecieRequest;
import br.com.fiap.ferramenta.dto.response.EspecieResponse;
import br.com.fiap.ferramenta.entity.Especie;
import br.com.fiap.ferramenta.entity.TipoRisco;
import br.com.fiap.ferramenta.service.EspecieService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.Collection;
import java.util.Objects;

@RestController
@RequestMapping(value = "/especie")
public class EspecieResource implements ResourceDTO<EspecieRequest, EspecieResponse>{

    @Autowired
    private EspecieService service;


    @GetMapping
    public ResponseEntity<Collection<EspecieResponse>> findAll(

            @RequestParam(name = "id", required = false) Long id,
            @RequestParam(name = "nome", required = false) String nome,
            @RequestParam(name = "especie", required = false) String especie,
            @RequestParam(name = "tipo", required = false) TipoRisco tipo
    ) {
        var especieExample = Especie.builder()
                .id(id)
                .nome(nome)
                .especie(especie)
                .tipo(tipo)
                .build();

        ExampleMatcher matcher = ExampleMatcher
                .matchingAll()
                .withIgnoreCase()
                .withIgnoreNullValues();

        Example<Especie> example = Example.of(especieExample, matcher);
        Collection<Especie> all = service.findAll(example);
        if (Objects.isNull(all) || all.isEmpty()) return ResponseEntity.notFound().build();
        var response = all.stream().map(service::toResponse).toList();
        return ResponseEntity.ok(response);

    }

    @GetMapping(value = "/{id}")
    @Override
    public ResponseEntity<EspecieResponse> findById(@PathVariable Long id) {
        var entity = service.findById(id);
        if (Objects.isNull(entity)) return ResponseEntity.notFound().build();
        var response = service.toResponse(entity);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    @Transactional
    @Override
    public ResponseEntity<EspecieResponse> save(@RequestBody @Valid EspecieRequest c) {
        var entity = service.toEntity(c);

        entity = service.save(entity);

        var response = service.toResponse(entity);

        var uri = ServletUriComponentsBuilder.fromCurrentRequestUri()
                .path("/{id}")
                .buildAndExpand(entity.getId())
                .toUri();

        return ResponseEntity.created(uri).body(response);
    }
}
