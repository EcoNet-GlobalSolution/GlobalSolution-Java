package br.com.fiap.ferramenta.resource;

import br.com.fiap.ferramenta.dto.request.EmbarcacaoRequest;
import br.com.fiap.ferramenta.dto.request.EspecieRequest;
import br.com.fiap.ferramenta.dto.response.EmbarcacaoResponse;
import br.com.fiap.ferramenta.dto.response.EspecieResponse;
import br.com.fiap.ferramenta.entity.Embarcacao;
import br.com.fiap.ferramenta.entity.Especie;
import br.com.fiap.ferramenta.entity.TipoEmbarcacao;
import br.com.fiap.ferramenta.entity.TipoRisco;
import br.com.fiap.ferramenta.service.EmbarcacaoService;
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
@RequestMapping(value = "/embarcacao")
public class EmbarcacaoResource implements ResourceDTO<EmbarcacaoRequest, EmbarcacaoResponse>{

    @Autowired
    private EmbarcacaoService service;

    @GetMapping
    public ResponseEntity<Collection<EmbarcacaoResponse>> findAll(

            @RequestParam(name = "id", required = false) Long id,
            @RequestParam(name = "nome", required = false) String nome,
            @RequestParam(name = "proprietario", required = false) String proprietario,
            @RequestParam(name = "tipo", required = false) TipoEmbarcacao tipo
    ) {
        var embarcacaoExample = Embarcacao.builder()
                .id(id)
                .nome(nome)
                .proprietario(proprietario)
                .tipo(tipo)
                .build();

        ExampleMatcher matcher = ExampleMatcher
                .matchingAll()
                .withIgnoreCase()
                .withIgnoreNullValues();

        Example<Embarcacao> example = Example.of(embarcacaoExample, matcher);
        Collection<Embarcacao> all = service.findAll(example);
        if (Objects.isNull(all) || all.isEmpty()) return ResponseEntity.notFound().build();
        var response = all.stream().map(service::toResponse).toList();
        return ResponseEntity.ok(response);

    }

    @GetMapping(value = "/{id}")
    @Override
    public ResponseEntity<EmbarcacaoResponse> findById(@PathVariable Long id) {
        var entity = service.findById(id);
        if (Objects.isNull(entity)) return ResponseEntity.notFound().build();
        var response = service.toResponse(entity);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    @Transactional
    @Override
    public ResponseEntity<EmbarcacaoResponse> save(@RequestBody @Valid EmbarcacaoRequest c) {
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
