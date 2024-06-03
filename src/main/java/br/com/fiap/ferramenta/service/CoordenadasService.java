package br.com.fiap.ferramenta.service;

import br.com.fiap.ferramenta.dto.request.CoordenadaRequest;
import br.com.fiap.ferramenta.dto.response.CoordenadaResponse;
import br.com.fiap.ferramenta.entity.Coordenadas;
import br.com.fiap.ferramenta.repository.CoordenadasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class CoordenadasService implements ServiceDTO<Coordenadas, CoordenadaRequest, CoordenadaResponse> {

    @Autowired
    private CoordenadasRepository repo;

    @Override
    public Coordenadas toEntity(CoordenadaRequest r) {
        return Coordenadas.builder()
                .id(r.id())
                .longitude(r.longitude())
                .latitude(r.latitude())
                .build();
    }

    @Override
    public CoordenadaResponse toResponse(Coordenadas e) {
        return CoordenadaResponse.builder()
                .id(e.getId())
                .longitude(e.getLongitude())
                .latitude(e.getLatitude())
                .build();
    }

    @Override
    public Collection<Coordenadas> findAll(Example<Coordenadas> example) {
        return List.of();
    }

    @Override
    public Coordenadas findById(Long id) {
        return null;
    }

    @Override
    public Coordenadas save(Coordenadas e) {
        return null;
    }
}

