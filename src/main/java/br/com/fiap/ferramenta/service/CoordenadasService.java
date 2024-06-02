package br.com.fiap.ferramenta.service;

import br.com.fiap.ferramenta.dto.request.CoordenadaRequest;
import br.com.fiap.ferramenta.dto.response.CoordenadaResponse;
import br.com.fiap.ferramenta.entity.Coordenadas;
import br.com.fiap.ferramenta.repository.CoordenadasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class CoordenadasService implements ServiceDTO<Coordenadas, CoordenadaRequest, CoordenadaResponse> {

    @Autowired
    private CoordenadasRepository repo;

    @Override
    public Collection<Coordenadas> findAll(Example<Coordenadas> example) {
        return repo.findAll(example);
    }

    @Override
    public Optional<Coordenadas> findById(Long id) {
        return repo.findById(id);
    }

    @Override
    public Coordenadas save(Coordenadas e) {
        return repo.save(e);
    }

    @Override
    public Coordenadas toEntity(CoordenadaRequest dto) {
        return null;
    }

    @Override
    public CoordenadaResponse toResponse(Coordenadas e) {
        return null;
    }
}

