package br.com.fiap.ferramenta.resource;

import br.com.fiap.ferramenta.dto.request.DeteccaoRequest;
import br.com.fiap.ferramenta.dto.response.DeteccaoResponse;
import br.com.fiap.ferramenta.entity.Deteccao;
import br.com.fiap.ferramenta.service.DeteccaoService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Objects;

@RestController
@RequestMapping(value = "/deteccao")
public class DeteccaoResource implements ResourceDTO<DeteccaoRequest, DeteccaoResponse>{

    @Autowired
    private DeteccaoService service;

    @GetMapping
    public ResponseEntity<Collection<DeteccaoResponse>> findAll(

            @RequestParam(name = "id", required = false) Long id,
            @RequestParam(name = "data", required = false) LocalDate data
    ) {
        var deteccaoExample = Deteccao.builder()
                .id(id)
                .data(data)
                .build();

        ExampleMatcher matcher = ExampleMatcher
                .matchingAll()
                .withIgnoreCase()
                .withIgnoreNullValues();

        Example<Deteccao> example = Example.of(deteccaoExample, matcher);
        Collection<Deteccao> all = service.findAll(example);
        if (Objects.isNull(all) || all.isEmpty()) return ResponseEntity.notFound().build();
        var response = all.stream().map(service::toResponse).toList();
        return ResponseEntity.ok(response);

    }

    @GetMapping(value = "/{id}")
    @Override
    public ResponseEntity<DeteccaoResponse> findById(@PathVariable Long id) {
        var entity = service.findById(id);
        if (Objects.isNull(entity)) return ResponseEntity.notFound().build();
        var response = service.toResponse(entity);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    @Transactional
    @Override
    public ResponseEntity<DeteccaoResponse> save(@RequestBody @Valid DeteccaoRequest c) {
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
