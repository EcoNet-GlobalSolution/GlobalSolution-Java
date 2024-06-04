package br.com.fiap.ferramenta.service;

import br.com.fiap.ferramenta.dto.request.CoordenadaRequest;
import br.com.fiap.ferramenta.dto.response.CoordenadaResponse;
import br.com.fiap.ferramenta.entity.Coordenada;
import br.com.fiap.ferramenta.repository.CoordenadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CoordenadaService implements ServiceDTO<Coordenada, CoordenadaRequest, CoordenadaResponse> {

    @Autowired
    private CoordenadaRepository repo;

    @Override
    public Coordenada toEntity(CoordenadaRequest r) {
        return Coordenada.builder()
                .id(r.id())
                .longitude(r.longitude())
                .latitude(r.latitude())
                .build();
    }

    @Override
    public CoordenadaResponse toResponse(Coordenada e) {
        return CoordenadaResponse.builder()
                .id(e.getId())
                .longitude(e.getLongitude())
                .latitude(e.getLatitude())
                .build();
    }

    @Override
    public Collection<Coordenada> findAll(Example<Coordenada> example) {
        return repo.findAll( example );
    }

    @Override
    public Coordenada findById(Long id) {
        return repo.findById( id ).orElse( null );
    }

    @Override
    public Coordenada save(Coordenada e) {
        return repo.save( e );
    }
}

