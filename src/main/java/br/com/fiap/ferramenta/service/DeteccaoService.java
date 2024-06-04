package br.com.fiap.ferramenta.service;

import br.com.fiap.ferramenta.dto.request.DeteccaoRequest;
import br.com.fiap.ferramenta.dto.response.DeteccaoResponse;
import br.com.fiap.ferramenta.entity.Deteccao;
import br.com.fiap.ferramenta.repository.DeteccaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class DeteccaoService implements ServiceDTO<Deteccao, DeteccaoRequest, DeteccaoResponse>{

    @Autowired
    private DeteccaoRepository repo;

    @Autowired
    private EspecieService especieService;

    @Autowired
    private CoordenadaService coordenadaService;

    @Override
    public Deteccao toEntity(DeteccaoRequest r) {

        var especie = especieService.findById(r.especie().id());

        var coordenada = coordenadaService.toEntity(r.coordenada());

        return Deteccao.builder()
                .id(r.id())
                .data(r.data())
                .especie(especie)
                .coordenada(coordenada)
                .build();
    }

    @Override
    public DeteccaoResponse toResponse(Deteccao e) {

        var especie = especieService.toResponse(e.getEspecie());

        var coordenada = coordenadaService.toResponse(e.getCoordenada());

        return DeteccaoResponse.builder()
                .id(e.getId())
                .data(e.getData())
                .especie(especie)
                .coordenada(coordenada)
                .build();
    }

    @Override
    public Collection<Deteccao> findAll(Example<Deteccao> example) {
        return repo.findAll( example );
    }

    @Override
    public Deteccao findById(Long id) {
        return repo.findById( id ).orElse( null );
    }

    @Override
    public Deteccao save(Deteccao e) {
        return repo.save( e );
    }
}

