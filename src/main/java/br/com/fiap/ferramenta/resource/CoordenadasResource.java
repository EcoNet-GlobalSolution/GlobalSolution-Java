package br.com.fiap.ferramenta.resource;

import br.com.fiap.ferramenta.dto.request.CoordenadaRequest;
import br.com.fiap.ferramenta.dto.response.CoordenadaResponse;
import br.com.fiap.ferramenta.entity.Coordenadas;
import br.com.fiap.ferramenta.service.CoordenadasService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Objects;

@RestController
@RequestMapping(value = "/coordenadas")
public class CoordenadasResource implements ResourceDTO<CoordenadaRequest, CoordenadaResponse>{

    @Autowired
    private CoordenadasService service;

    @GetMapping
    public ResponseEntity<Collection<CoordenadaResponse>> findAll(

            @RequestParam(name = "id", required = false) Long id,
            @RequestParam(name = "latitude", required = false) BigDecimal latitude,
            @RequestParam(name = "longitude", required = false) BigDecimal longitude
    ) {
        var coordenadaExample = Coordenadas.builder()
                .id(id)
                .latitude(latitude)
                .longitude(longitude)
                .build();

        ExampleMatcher matcher = ExampleMatcher
                .matchingAll()
                .withIgnoreCase()
                .withIgnoreNullValues();

        Example<Coordenadas> example = Example.of(coordenadaExample, matcher);
        Collection<Coordenadas> all = service.findAll(example);
        if (Objects.isNull(all) || all.isEmpty()) return ResponseEntity.notFound().build();
        var response = all.stream().map(service::toResponse).toList();
        return ResponseEntity.ok(response);

    }

    @GetMapping(value = "/{id}")
    @Override
    public ResponseEntity<CoordenadaResponse> findById(@PathVariable Long id) {
        var entity = service.findById(id);
        if (Objects.isNull(entity)) return ResponseEntity.notFound().build();
        var response = service.toResponse(entity);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    @Transactional
    @Override
    public ResponseEntity<CoordenadaResponse> save(@RequestBody @Valid CoordenadaRequest c) {
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
