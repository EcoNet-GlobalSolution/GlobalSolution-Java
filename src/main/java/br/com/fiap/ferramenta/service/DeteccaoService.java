package br.com.fiap.ferramenta.service;

import br.com.fiap.ferramenta.dto.request.DeteccaoRequest;
import br.com.fiap.ferramenta.dto.response.DeteccaoResponse;
import br.com.fiap.ferramenta.entity.Deteccao;
import br.com.fiap.ferramenta.repository.DeteccaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class DeteccaoService implements ServiceDTO<Deteccao, DeteccaoRequest, DeteccaoResponse>{

    @Autowired
    private DeteccaoRepository repo;

    @Override
    public Collection<Deteccao> findAll(Example<Deteccao> example) {
        return repo.findAll(example);
    }

    @Override
    public Optional<Deteccao> findById(Long id) {
        return repo.findById(id);
    }

    @Override
    public Deteccao save(Deteccao e) {
        return repo.save(e);
    }

    @Override
    public Deteccao toEntity(DeteccaoRequest dto) {
        return null;
    }

    @Override
    public DeteccaoResponse toResponse(Deteccao e) {
        return null;
    }
}

