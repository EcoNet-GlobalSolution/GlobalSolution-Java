package br.com.fiap.ferramenta.service;

import br.com.fiap.ferramenta.dto.request.EspecieRequest;
import br.com.fiap.ferramenta.dto.response.EspecieResponse;
import br.com.fiap.ferramenta.entity.Especie;
import br.com.fiap.ferramenta.repository.EspecieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class EspecieService implements ServiceDTO<Especie, EspecieRequest, EspecieResponse>{

    @Autowired
    private EspecieRepository repo;

    @Override
    public Collection<Especie> findAll(Example<Especie> example) {
        return repo.findAll(example);
    }

    @Override
    public Optional<Especie> findById(Long id) {
        return repo.findById(id);
    }

    @Override
    public Especie save(Especie e) {
        return repo.save(e);
    }

    @Override
    public Especie toEntity(EspecieRequest dto) {
        return null;
    }

    @Override
    public EspecieResponse toResponse(Especie e) {
        return null;
    }
}

